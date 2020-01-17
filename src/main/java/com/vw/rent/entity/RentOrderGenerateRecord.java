package com.vw.rent.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.vw.rent.utils.base.BaseEntity;

/**
 * <p>
 * 租赁订单生成失败记录
 * </p>
 *
 * @author 王卫东 a853868671@gmail.com
 * @since 2019-03-26
 */
@TableName("vw_rent_order_generate_record")
public class RentOrderGenerateRecord extends BaseEntity {

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
     * 经销商名称
     */
    @TableField("dealer_name")
    private String dealerName;
    /**
     * 金融公司名称
     */
    @TableField("finance_name")
    private String financeName;
    /**
     * 唯一标识ID，上传文件接口需要用到（新动力提供）
     */
    @TableField("application_id")
    private String applicationId;


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

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public String toString() {
        return "RentOrderGenerateRecord{" +
        ", userId=" + userId +
        ", userTel=" + userTel +
        ", userName=" + userName +
        ", dealerName=" + dealerName +
        ", financeName=" + financeName +
        ", applicationId=" + applicationId +
        "}";
    }
}
