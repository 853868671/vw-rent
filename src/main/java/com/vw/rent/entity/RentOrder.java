package com.vw.rent.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.vw.rent.utils.base.BaseEntity;

import java.math.BigDecimal;

/**
 * <p>
 * 租赁订单表
 * </p>
 *
 * @author 王卫东 a853868671@gmail.com
 * @since 2019-03-26
 */
@TableName("vw_rent_order")
public class RentOrder extends BaseEntity {
    /**
     * 用户主键
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 手机号(快照信息)
     */
    @TableField("user_tel")
    private String userTel;
    /**
     * 用户名（快照信息）
     */
    @TableField("user_name")
    private String userName;
    /**
     * 身份证号码（快照信息）
     */
    @TableField("user_id_card_no")
    private String userIdCardNo;
    /**
     * 经销商code
     */
    @TableField("dealer_code")
    private String dealerCode;
    /**
     * 经销商名称
     */
    @TableField("dealer_name")
    private String dealerName;
    /**
     * 展厅地址
     */
    @TableField("dealer_address")
    private String dealerAddress;
    /**
     * 车型
     */
    @TableField("vehicle_type")
    private String vehicleType;
    /**
     * 金融公司名称
     */
    @TableField("finance_name")
    private String financeName;
    /**
     * 首付金额
     */
    @TableField("down_payments")
    private BigDecimal downPayments;
    /**
     * 月供
     */
    @TableField("month_pay")
    private BigDecimal monthPay;
    /**
     * 唯一标识ID(流水号)，上传文件接口需要用到（一汽租赁）
     */
    @TableField("serial_no")
    private String serialNo;
    /**
     * 唯一标识ID，上传文件接口需要用到（新动力提供）
     */
    @TableField("application_id")
    private String applicationId;
    /**
     * 申请人ID,冗余字段，上传文件接口需要用到（新动力提供）
     */
    @TableField("applicant_id")
    private String applicantId;
    /**
     * 商户网站唯一订单号（圣承生成）
     */
    @TableField("order_no")
    private String orderNo;
    /**
     * 1:新能源,2:燃油,0:其他
     */
    @TableField("order_type")
    private Integer orderType;
    /**
     * 暂时未确定 0审核中 1审核通过 2已支付 3车辆生产中 4车辆生产完成 5车辆已到店  6租赁中 7租赁结束 -1取消订单
     */
    @TableField("order_status")
    private Integer orderStatus;
    /**
     * 合同
     */
    private String agreement;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIdCardNo() {
        return userIdCardNo;
    }

    public void setUserIdCardNo(String userIdCardNo) {
        this.userIdCardNo = userIdCardNo;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    public BigDecimal getDownPayments() {
        return downPayments;
    }

    public void setDownPayments(BigDecimal downPayments) {
        this.downPayments = downPayments;
    }

    public BigDecimal getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(BigDecimal monthPay) {
        this.monthPay = monthPay;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    @Override
    public String toString() {
        return "RentOrder{" +
        ", userId=" + userId +
        ", userTel=" + userTel +
        ", userName=" + userName +
        ", userIdCardNo=" + userIdCardNo +
        ", dealerCode=" + dealerCode +
        ", dealerName=" + dealerName +
        ", dealerAddress=" + dealerAddress +
        ", vehicleType=" + vehicleType +
        ", financeName=" + financeName +
        ", downPayments=" + downPayments +
        ", monthPay=" + monthPay +
        ", applicationId=" + applicationId +
        ", applicantId=" + applicantId +
        ", orderNo=" + orderNo +
        ", orderType=" + orderType +
        ", orderStatus=" + orderStatus +
        ", agreement=" + agreement +
        "}";
    }
}
