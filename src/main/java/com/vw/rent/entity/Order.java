package com.vw.rent.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author wwd
 * @since 2019-12-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("vw_order")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    /**
     * 用户标识
     */
    private String token;

    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 商户网站唯一订单号（圣承生成）
     */
    @TableField("order_no")
    private String orderNo;

    /**
     * 主订单号，购物车批量提交订单的时候 的主订单号
     */
    @TableField("main_order_no")
    @Ignore
    private String mainOrderNo;

    /**
     * 判断是否属于多订单
     */
    @TableField("is_multiple")
    private Integer isMultiple;

    /**
     * 1新车 ，2 定制车，3 二手车，4精品/附件 ，5保养  ，6会员购，7金融租赁,8 直销，9特价车
     */
    @TableField("order_type")
    private Integer orderType;

    /**
     * 商品图片
     */
    private String img;

    /**
     * 第三方支付单号
     */
    @TableField("other_pay_no")
    private String otherPayNo;

    /**
     * 支付宝该笔订单的资金总额
     */
    private BigDecimal amount;

    /**
     * 支付方式1：支付宝支付 2：微信支付
     */
    @TableField("pay_type")
    private Integer payType;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 核销码
     */
    @TableField("off_code")
    private String offCode;

    /**
     * 退款原因
     */
    @TableField("refund_msg")
    private String refundMsg;

    /**
     * 退款服务费
     */
    @TableField("refund_server")
    private Float refundServer;

    /**
     * 退款金额
     */
    @TableField("refund_price")
    private Float refundPrice;

    /**
     * 微信支付的用户标识
     */
    private String openid;

    /**
     * 支付宝支付的账户
     */
    @TableField("buyer_logon_id")
    private String buyerLogonId;

    /**
     * 主订单的状态 0待支付 1支付成功 2订单完成 -1取消订单 -2申请退款 -3退款完成
     */
    @TableField("order_status")
    private Integer orderStatus;

    /**
     * 支付时间
     */
    @TableField("pay_time")
    private Integer payTime;

    /**
     * 订单创建时间
     */
    @TableField("created_time")
    private Integer createdTime;

    /**
     * 最后修改时间
     */
    @TableField("updated_time")
    private Integer updatedTime;

    @TableField("created_at")
    private Date createdAt;

    @TableField("updated_at")
    private Date updatedAt;

    /**
     * 经销商code
     */
    @TableField("dealer_code")
    private String dealerCode;

    /**
     * 订单完成时间
     */
    @TableField("v_time")
    private Integer vTime;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 身份证
     */
    private String card;

    /**
     * 优惠券code
     */
    @TableField("coupon_id")
    private String couponId;

    /**
     * 支付商户订单号
     */
    @TableField("pay_order_no")
    private String payOrderNo;

    /**
     * 收货地址
     */
    @TableField("shipping_address")
    private String shippingAddress;

    /**
     * 订单留言
     */
    private String message;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 退款原因 1 用户取消 2用户退货 3排产失败
     */
    private Integer refunds;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMainOrderNo() {
        return mainOrderNo;
    }

    public void setMainOrderNo(String mainOrderNo) {
        this.mainOrderNo = mainOrderNo;
    }

    public Integer getIsMultiple() {
        return isMultiple;
    }

    public void setIsMultiple(Integer isMultiple) {
        this.isMultiple = isMultiple;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getOtherPayNo() {
        return otherPayNo;
    }

    public void setOtherPayNo(String otherPayNo) {
        this.otherPayNo = otherPayNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOffCode() {
        return offCode;
    }

    public void setOffCode(String offCode) {
        this.offCode = offCode;
    }

    public String getRefundMsg() {
        return refundMsg;
    }

    public void setRefundMsg(String refundMsg) {
        this.refundMsg = refundMsg;
    }

    public Float getRefundServer() {
        return refundServer;
    }

    public void setRefundServer(Float refundServer) {
        this.refundServer = refundServer;
    }

    public Float getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(Float refundPrice) {
        this.refundPrice = refundPrice;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public Integer getvTime() {
        return vTime;
    }

    public void setvTime(Integer vTime) {
        this.vTime = vTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRefunds() {
        return refunds;
    }

    public void setRefunds(Integer refunds) {
        this.refunds = refunds;
    }

    public Integer getIsReturngoods() {
        return isReturngoods;
    }

    public void setIsReturngoods(Integer isReturngoods) {
        this.isReturngoods = isReturngoods;
    }

    public Integer getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Integer financeId) {
        this.financeId = financeId;
    }

    public Integer getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Integer returnTime) {
        this.returnTime = returnTime;
    }

    public String getPacPAcct() {
        return pacPAcct;
    }

    public void setPacPAcct(String pacPAcct) {
        this.pacPAcct = pacPAcct;
    }

    public Integer getIsProrate() {
        return isProrate;
    }

    public void setIsProrate(Integer isProrate) {
        this.isProrate = isProrate;
    }

    public String getUtmSource() {
        return utmSource;
    }

    public void setUtmSource(String utmSource) {
        this.utmSource = utmSource;
    }

    public String getUtmMedium() {
        return utmMedium;
    }

    public void setUtmMedium(String utmMedium) {
        this.utmMedium = utmMedium;
    }

    public String getUtmTerm() {
        return utmTerm;
    }

    public void setUtmTerm(String utmTerm) {
        this.utmTerm = utmTerm;
    }

    public String getUtmContent() {
        return utmContent;
    }

    public void setUtmContent(String utmContent) {
        this.utmContent = utmContent;
    }

    public String getUtmCampaign() {
        return utmCampaign;
    }

    public void setUtmCampaign(String utmCampaign) {
        this.utmCampaign = utmCampaign;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getUserCutdownId() {
        return userCutdownId;
    }

    public void setUserCutdownId(Integer userCutdownId) {
        this.userCutdownId = userCutdownId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUsedActivityId() {
        return usedActivityId;
    }

    public void setUsedActivityId(Integer usedActivityId) {
        this.usedActivityId = usedActivityId;
    }

    public Integer getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(Integer productionTime) {
        this.productionTime = productionTime;
    }

    public Integer getActivityIdParent() {
        return activityIdParent;
    }

    public void setActivityIdParent(Integer activityIdParent) {
        this.activityIdParent = activityIdParent;
    }

    public Integer getUsedPushStatus() {
        return usedPushStatus;
    }

    public void setUsedPushStatus(Integer usedPushStatus) {
        this.usedPushStatus = usedPushStatus;
    }

    public Integer getDdmpPush() {
        return ddmpPush;
    }

    public void setDdmpPush(Integer ddmpPush) {
        this.ddmpPush = ddmpPush;
    }

    public String getDdmpMsg() {
        return ddmpMsg;
    }

    public void setDdmpMsg(String ddmpMsg) {
        this.ddmpMsg = ddmpMsg;
    }

    public Integer getIsRetail() {
        return isRetail;
    }

    public void setIsRetail(Integer isRetail) {
        this.isRetail = isRetail;
    }

    /**
     * 是否有退货操作
     */

    @TableField("is_returngoods")
    private Integer isReturngoods;

    /**
     * 财务审核id
     */
    @TableField("finance_id")
    private Integer financeId;

    /**
     * 取消时间
     */
    @TableField("return_time")
    private Integer returnTime;

    /**
     * 支付人信息（暂时通过财务接口获取）
     */
    @TableField("pac_p_acct")
    private String pacPAcct;

    /**
     * 是否分帐
     */
    @TableField("is_prorate")
    private Integer isProrate;

    /**
     * 来源
     */
    @TableField("utm_source")
    private String utmSource;

    /**
     * 媒介
     */
    @TableField("utm_medium")
    private String utmMedium;

    /**
     * 关键词
     */
    @TableField("utm_term")
    private String utmTerm;

    /**
     * 来自pc还是手机端
     */
    @TableField("utm_content")
    private String utmContent;

    /**
     * 广告系列
     */
    @TableField("utm_campaign")
    private String utmCampaign;

    /**
     * 是否删除订单   1 未删除  2已删除
     */
    @TableField(value = "delete_status",exist = false)
    private Integer deleteStatus;

    /**
     * 核销结束时间
     */
    @TableField(value = "end_time",exist = false)
    private Integer endTime;

    /**
     * 活动id
     */
    @TableField(value = "activity_id",exist = false)
    private Integer activityId;

    /**
     * 用户砍价活动发起id(vw_user_cutdown的id)
     */
    @TableField(value = "user_cutdown_id",exist = false)
    private Integer userCutdownId;

    @TableField(value = "user_id",exist = false)
    private Integer userId;

    /**
     * 二手车活动id
     */
    @TableField(value = "used_activity_id",exist = false)
    private Integer usedActivityId;

    /**
     * 订单确认生产统计时间
     */
    @TableField(value = "production_time",exist = false)
    private Integer productionTime;

    /**
     * 活动ID的父级ID 默认为0
     */
    @TableField(value = "activity_id_parent",exist = false)
    private Integer activityIdParent;

    /**
     * 0未推送,10位时间戳，已推送时间，2推送失败
     */
    @TableField(value = "used_push_status",exist = false)
    private Integer usedPushStatus;

    /**
     * 是否推送ddmp默认0
     */
    @TableField(value = "ddmp_push",exist = false)
    private Integer ddmpPush;

    /**
     * 推送信息
     */
    @TableField(value = "ddmp_msg",exist = false)
    private String ddmpMsg;

    /**
     * 是否为零售店下单0否，1是
     */
    @TableField(value = "is_retail",exist = false)
    private Integer isRetail;


    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

}
