package com.vw.rent.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.vw.rent.dto.RentCallBackFileDTO;
import com.vw.rent.dto.RentStatusRequestDTO;
import com.vw.rent.entity.RentOrder;
import com.vw.rent.enums.FinanceNameEnum;
import com.vw.rent.enums.ResultStatusEnum;
import com.vw.rent.service.RentEvaluateService;
import com.vw.rent.service.RentOrderService;
import com.vw.rent.service.RentVehicleImageService;
import com.vw.rent.service.RentVehicleService;
import com.vw.rent.utils.base.StringUtils;
import com.vw.rent.utils.base.UUIDUtils;
import com.vw.rent.utils.result.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 大众电商提供给金融方回调接口
 * @author 王卫东 a853868671@gmail.com
 * @date 19-3-22
 */
@RestController
@RequestMapping("/fawShopping")
public class FawShoppingController {
    // 租赁订单
    private RentOrderService rentOrderService;
    // 租赁车型
    private RentVehicleService rentVehicleService;
    // 租赁车型图片
    private RentVehicleImageService rentVehicleImageService;
    // 租赁汽车评价
    private RentEvaluateService rentEvaluateService;

    @PostMapping("/rent/callback")
    public Result rentOrderStatusChange(@RequestBody RentStatusRequestDTO param){
        /**
         * 规划：
         *  校验错误：-1
         *  业务处理错误：-2
         *  其他错误：-3
         *  成功：0
         */
        // 1.参数校验
        if(FinanceNameEnum.getByValue(param.getFinanceName()) == null){
            return Result.FAIL("金融类型不在规定的取值范围内！");
        }

        if(ResultStatusEnum.getByValue(param.getStatus()+"")  == null){
            return Result.FAIL("状态码未在规定的取值范围内！");
        }

        if(StringUtils.isBlank(param.getSerialNo())){
            return Result.FAIL("唯一标识不能为空！");
        }

        // 2.内部业务处理
        if(FinanceNameEnum.NEW_POWER.getValue().equalsIgnoreCase(param.getFinanceName())){ // 新动力
            return updateOrderStatus(param,"application_id={0}");
        }else if(FinanceNameEnum.FAW_LEASING.getValue().equalsIgnoreCase(param.getFinanceName())){ // 一汽租赁
            return updateOrderStatus(param,"serial_no={0}");
        }
        return Result.OK();
    }

    private Result updateOrderStatus(RentStatusRequestDTO param,String expression){
        RentOrder rentOrder = rentOrderService.selectOne(new EntityWrapper<RentOrder>().where(expression,param.getSerialNo()));
        if(rentOrder == null || StringUtils.isBlank(rentOrder.getOrderNo())){
            return Result.FAIL(-2,"账单不存在！请联系商城客服！");
        }

        if(rentOrder.getOrderStatus() == null || param.getStatus() <= rentOrder.getOrderStatus()){
            return Result.FAIL(-2,"指定状态与当前商城账单状态存在先后顺序问题，请联系商城客服！");
        }

        // 3.响应金融方
        RentOrder update = new RentOrder();
        update.setOrderStatus(param.getStatus());
        if(!rentOrderService.update(update,new EntityWrapper<RentOrder>().where(expression,param.getSerialNo()))){
            return Result.FAIL(-3,"操作失败，请联系系统管理员!");
        }
        return Result.OK();
    }

    @PostMapping("/rent/callback/agreement")
    public Result callBackFile(RentCallBackFileDTO param){
        /**
         * 规划：
         *  校验错误：-1
         *  业务处理错误：-2
         *  其他错误：-3
         *  成功：0
         */
        if(FinanceNameEnum.getByValue(param.getFinanceName()) == null){
            return Result.FAIL("金融类型不在规定的取值范围内！");
        }

        if(StringUtils.isBlank(param.getSerialNo())){
            return Result.FAIL("唯一标识不能为空！");
        }

        if(param.getFile() == null || param.getFile().isEmpty()){
            return Result.FAIL("请选择需要上传的文件!");
        }

        try{
            Date date = new Date();
            String dateForm = new SimpleDateFormat("yyyy"+ File.separator+"MM").format(date);
            String path = File.separator+"data"+File.separator+"fileTest"+File.separator+dateForm;

            String originalFileName = param.getFile().getOriginalFilename();
            String newFileName = UUIDUtils.getUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));

            File dest = new File(path,newFileName);
            if(!dest.getParentFile().exists()){
                dest.getParentFile().mkdirs();
            }
            param.getFile().transferTo(dest);

            RentOrder order = new RentOrder();
            order.setAgreement(File.separator+dateForm+File.separator+newFileName); // 合同
            if(FinanceNameEnum.NEW_POWER.getValue().equalsIgnoreCase(param.getFinanceName())){ // 新动力
                return updateOrderAgreement(order,param.getSerialNo(),"application_id={0}");
            }else if(FinanceNameEnum.FAW_LEASING.getValue().equalsIgnoreCase(param.getFinanceName())){ // 一汽租赁
                return updateOrderAgreement(order,param.getSerialNo(),"serial_no={0}");
            }
        }catch (Exception e){
            return Result.FAIL(-3,"操作失败，请联系系统管理员!");
        }
        return Result.FAIL(-3,"操作失败，请联系系统管理员!");
    }

    private Result updateOrderAgreement(RentOrder order,String serialNo,String field){
        int count = rentOrderService.selectCount(new EntityWrapper<RentOrder>().where(field,serialNo));
        if(count < 1){
            return Result.FAIL(-2,"订单不存在！");
        }

        if(!rentOrderService.update(order,new EntityWrapper<RentOrder>().where(field,serialNo))){
            return Result.FAIL(-3,"操作失败，请联系系统管理员!");
        }
        return Result.OK();
    }
}
