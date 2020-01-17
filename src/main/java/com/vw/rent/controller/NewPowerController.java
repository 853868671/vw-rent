package com.vw.rent.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.vw.rent.dto.NewPowerRequestDTO;
import com.vw.rent.dto.NewPowerRequestWithFileDTO;
import com.vw.rent.entity.RentOrder;
import com.vw.rent.entity.RentOrderGenerateRecord;
import com.vw.rent.enums.FinanceNameEnum;
import com.vw.rent.enums.OrderStatusEnum;
import com.vw.rent.enums.OrderTypeEnum;
import com.vw.rent.enums.newPower.HousePropertyTypeEnum;
import com.vw.rent.enums.newPower.IdDocumentTypeEnum;
import com.vw.rent.enums.IndustryCodeEnum;
import com.vw.rent.enums.newPower.MaritalStatusEnum;
import com.vw.rent.service.*;
import com.vw.rent.utils.base.DateUtils;
import com.vw.rent.utils.base.HttpUtil;
import com.vw.rent.utils.base.StringUtils;
import com.vw.rent.utils.base.UUIDUtils;
import com.vw.rent.utils.random.RandomNum;
import com.vw.rent.utils.result.Result;
import com.vw.rent.utils.validate.IDCardUtils;
import com.vw.rent.utils.validate.ValidateUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 新动力金融接口
 * @author 王卫东 a853868671@gmail.com
 * @date 19-3-22
 */
@RestController
@RequestMapping("/newPower")
public class NewPowerController {
    // 租赁订单
    private RentOrderService rentOrderService;
    // 租赁车型
    private RentVehicleService rentVehicleService;
    // 租赁车型图片
    private RentVehicleImageService rentVehicleImageService;
    // 租赁汽车评价
    private RentEvaluateService rentEvaluateService;
    // 租赁订单生成失败记录
    private RentOrderGenerateRecordService rentOrderGenerateRecordService;

    /**
     * 授信
     * @param param
     * @return
     */
    @PostMapping("/credit/extension")
    public Result creditExtension(NewPowerRequestWithFileDTO param){
        Result rt = validate(param);
        if(rt != null){
            return rt;
        }

        rt = processFile(param);
        if(rt != null){
            return rt;
        }

        NewPowerExecuteCreditResult npec = executeCreditExtension(structure(param));
        if(StringUtils.isBlank(npec.getApplicantId()) || StringUtils.isBlank(npec.getApplicationId())){
            return Result.FAIL("授信失败!");
        }

        return structureRentOrder(npec,param);
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

    /**
     * 处理上传文件
     * @param param
     * @return
     */
    private Result processFile(NewPowerRequestWithFileDTO param){
        try {
            String path,originalFileName,newFileName;
            File dest;
            Date date = new Date();
            String dateForm = new SimpleDateFormat("yyyy"+ File.separator+"MM").format(date);
            path = File.separator+"data"+File.separator+"fileTest"+File.separator+dateForm;

            // 身份证人像面
            originalFileName = param.getIdFront().getOriginalFilename();
            newFileName = UUIDUtils.getUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));

            dest = new File(path,newFileName);
            if(!dest.getParentFile().exists()){
                dest.getParentFile().mkdirs();
            }
            param.getIdFront().transferTo(dest);
            param.setIdFrontPath(File.separator+dateForm+File.separator+newFileName);

            // 身份证国徽面
            originalFileName = param.getIdBack().getOriginalFilename();
            newFileName = UUIDUtils.getUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));
            dest = new File(path,newFileName);
            param.getIdBack().transferTo(dest);
            param.setIdBackPath(File.separator+dateForm+File.separator+newFileName);

            // 驾驶证
            originalFileName = param.getDrivingLicence().getOriginalFilename();
            newFileName = UUIDUtils.getUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));
            dest = new File(path,newFileName);
            param.getDrivingLicence().transferTo(dest);
            param.setDrivingLicencePath(File.separator+dateForm+File.separator+newFileName);
        }catch (Exception e){
            return Result.FAIL("上传文件失败!");
        }
        return null;
    }

    /**
     * 构造授信参数
     * @param param
     * @return
     */
    private String structure(NewPowerRequestWithFileDTO param){
        NewPowerRequestDTO newPowerRequestDTO = param;
        return JSON.toJSONString(newPowerRequestDTO);
    }

    /**
     * 执行授信
     * @param jsonBody
     * @return
     */
    private NewPowerExecuteCreditResult executeCreditExtension(String jsonBody){
        Map<String, String> param = new HashMap<>();
        param.put("Content-Type","application/application/json");
        JSONObject jsonObject = JSONObject.parseObject(HttpUtil.httpPost("http://****/api/v1.0/leasing/fawvwOnlineStore/applications",jsonBody,param));
        NewPowerExecuteCreditResult rt = new NewPowerExecuteCreditResult();
        rt.setApplicantId(jsonObject.getString("applicantId"));
        rt.setApplicationId(jsonObject.getString("applicationId"));
        return rt;
    }

    /**
     * 构造并生成租赁订单
     * @param npec
     * @param param
     * @return
     */
    private Result structureRentOrder(NewPowerExecuteCreditResult npec,NewPowerRequestWithFileDTO param){
        RentOrder rentOrder = new RentOrder();
        rentOrder.setUserId(111);
        rentOrder.setUserName(param.getContactName());
        rentOrder.setUserTel(param.getContactPhoneNumber());
        rentOrder.setUserIdCardNo(param.getIdNumber());
        rentOrder.setDealerCode("dealerCode");
        rentOrder.setDealerName(param.getDealerName());
        rentOrder.setDealerAddress("dealerAddress");
        rentOrder.setVehicleType("vehicleType");
        rentOrder.setFinanceName(FinanceNameEnum.FAW_LEASING.getValue());
        rentOrder.setDownPayments(param.getDownPaymentAmount());
        rentOrder.setMonthPay(param.getMonthlyInstallment());
        rentOrder.setApplicationId(npec.getApplicationId());
        rentOrder.setApplicantId(npec.getApplicantId());
        rentOrder.setOrderNo(DateUtils.formatDate(new Date(),"yyyyMMddHHmmss")+ RandomNum.createSmsAuthCode(10));
        rentOrder.setOrderType(OrderTypeEnum.NEW_ENERGY.getValue());
        rentOrder.setOrderStatus(OrderStatusEnum.AUDITING.getValue());
        Date date = new Date();
        rentOrder.setCreateTime(date);
        rentOrder.setUpdateTime(date);
        if(rentOrderService.insert(rentOrder)){
            return Result.OK();
        }

        RentOrderGenerateRecord rogr = new RentOrderGenerateRecord();
        rogr.setApplicationId(rentOrder.getApplicationId());
        rogr.setDealerName(rentOrder.getDealerName());
        rogr.setFinanceName(FinanceNameEnum.NEW_POWER.getValue());
        rogr.setUserId(rentOrder.getUserId());
        rogr.setUserName(rentOrder.getUserName());
        rogr.setUserTel(rentOrder.getUserTel());
        rentOrderGenerateRecordService.insert(rogr);
        return Result.FAIL("申请失败!");
    }

    /**
     * 获取授权经销商列表
     * @param type
     * @return
     */
    @GetMapping("/obtain/dealers/list/{type}")
    public Result obtainDealerList(@PathVariable int type){
        return null;
    }
}

/**
 * 新动力授信接口
 */
class NewPowerExecuteCreditResult{
    private String applicationId;
    private String applicantId;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }
}
