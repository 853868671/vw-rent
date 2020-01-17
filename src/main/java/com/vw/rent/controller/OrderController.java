package com.vw.rent.controller;

import com.vw.rent.dto.NewPowerRequestWithFileDTO;
import com.vw.rent.entity.Order;
import com.vw.rent.enums.IndustryCodeEnum;
import com.vw.rent.enums.newPower.HousePropertyTypeEnum;
import com.vw.rent.enums.newPower.IdDocumentTypeEnum;
import com.vw.rent.enums.newPower.MaritalStatusEnum;
import com.vw.rent.service.IOrderService;
import com.vw.rent.service.RentOrderService;
import com.vw.rent.utils.base.StringUtils;
import com.vw.rent.utils.result.Result;
import com.vw.rent.utils.validate.IDCardUtils;
import com.vw.rent.utils.validate.ValidateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author wwd
 * @since 2019-12-30
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private IOrderService orderService;
    @Autowired
    RentOrderService rentOrderService;

    @PostMapping("createNewOrder")
    public Result orderInfo(NewPowerRequestWithFileDTO parm) {
        logger.info("订单信息");
//        Result rt = validate(parm);
//
//        if (rt != null) {
//            return rt;
//        }

        return this.saveOrder(parm);

    }

    private Result saveOrder(NewPowerRequestWithFileDTO parm) {
        Order order = new Order();
        order.setOrderNo(parm.getContactName());
        order.setTitle("租赁订单");

        if (orderService.insert(order)) {
            return Result.OK();
        }
        return Result.FAIL("err");
    }

    /**
     * 校验用户参数
     * @param param
     * @return
     */
    private Result validate(NewPowerRequestWithFileDTO param){
        if(param.getIdFront() == null || param.getIdFront().isEmpty()){
            return Result.FAIL("身份证人相面必须上传！");
        }

        if(param.getIdBack() == null || param.getIdBack().isEmpty()){
            return Result.FAIL("身份证国徽面必须上传！");
        }

        if(param.getDrivingLicence() == null || param.getDrivingLicence().isEmpty()){
            return Result.FAIL("驾驶证必须上传！");
        }

        if(StringUtils.isBlank(param.getContactName())){
            return Result.FAIL("客户姓名不能为空!");
        }

        if(!ValidateUtils.isMobile(param.getContactPhoneNumber())){
            return Result.FAIL("客户手机号码不合法!");
        }

        if(param.getModelId() <= 0){
            return Result.FAIL("请选择车型!");
        }

        if(param.getVariantId() <= 0){
            return Result.FAIL("车型描述主键不能为空！");
        }

        if(param.getVehiclePrice().compareTo(new BigDecimal(0)) <= 0){
            return Result.FAIL("车辆销售价格不能小于等于0！");
        }

        if(param.getVehicleCount() <= 0){
            return Result.FAIL("购买数量不能小于等于0！");
        }

        if(param.getTenor() <= 0){
            return Result.FAIL("融资期限（月）不能小于等于0！");
        }

        if(param.getTotalAmount().compareTo(new BigDecimal(0)) <= 0){
            return Result.FAIL("融资金额不能小于等于0！");
        }

        if(param.getMonthlyInstallment().compareTo(new BigDecimal(0)) <= 0){
            return Result.FAIL("月供不能小于等于0！");
        }

        if(param.getInterestRate() <= 0){
            return Result.FAIL("利率不能小于等于0!");
        }

        if(param.getDownPaymentAmount().compareTo(new BigDecimal(0)) <= 0){
            return Result.FAIL("首付款金额不能小于等于0！");
        }

        if(param.getDownPaymentRatio() <= 0){
            return Result.FAIL("首付款比例不能小于等于0!");
        }

        if(param.getBalloonAmount().compareTo(new BigDecimal(0)) <= 0){
            return Result.FAIL("尾款金额不能小于等于0！");
        }

        if(StringUtils.isBlank(param.getDealerName())){
            return Result.FAIL("请选择经销商!");
        }

        if(IdDocumentTypeEnum.getByValue(param.getIdDocumentType()) == null){
            return Result.FAIL("证件类型不在取值范围内！");
        }

        if(!ValidateUtils.isDate(param.getBirthday())){
            return Result.FAIL("生日日期格式错误,正确格式：yyyy-MM-dd!");
        }

        if(StringUtils.isBlank(param.getIdNumber())){
            return Result.FAIL("证件号不能为空!");
        }else{
            if(IdDocumentTypeEnum.one.getValue().equalsIgnoreCase(param.getIdNumber())
                    && !IDCardUtils.verifi(param.getIdNumber())){
                return Result.FAIL("身份证不合法!");
            }
        }

        if(MaritalStatusEnum.getByValue(param.getMaritalStatus()) == null){
            return Result.FAIL("婚姻状况不在取值范围内！");
        }

        if(!ValidateUtils.isEmail(param.getEmail())){
            return Result.FAIL("email格式不合法!");
        }

        if(param.getProvinceId() <= 0){
            return Result.FAIL("省份主键不能为空!");
        }

        if(param.getCityId() <= 0){
            return Result.FAIL("城市主键不能为空!");
        }

        if(StringUtils.isBlank(param.getContactAddress())){
            return Result.FAIL("联系地址不能为空!");
        }

        if(HousePropertyTypeEnum.getByValue(param.getHousePropertyType()) == null){
            return Result.FAIL("房产类型不在取值范围内！");
        }

        if(IndustryCodeEnum.getByValue(param.getIndustryCode()) == null){
            return Result.FAIL("行业信息不在取值范围内！");
        }

        if(StringUtils.isBlank(param.getEmployerName())){
            return Result.FAIL("工作单位名称不能为空！");
        }

        if(StringUtils.isBlank(param.getCompanyAddress())){
            return Result.FAIL("工作单位地址!");
        }

        if(param.getMonthlyIncome().compareTo(new BigDecimal(0)) <= 0){
            return Result.FAIL("月总收入不能小于等于0！");
        }

        if(param.getMonthlyExpense().compareTo(new BigDecimal(0)) <= 0){
            return Result.FAIL("月总支出不能小于等于0！");
        }

        if(param.getResidenceYear() <= 0){
            return Result.FAIL("居住年份不合法！");
        }

        if(param.getResidenceMonth() < 1 || param.getResidenceMonth() > 12){
            return Result.FAIL("月份不合法!");
        }
        return null;
    }

}
