package com.vw.rent.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.vw.rent.utils.base.BaseEntity;

/**
 * <p>
 * 租赁车评价表
 * </p>
 *
 * @author 王卫东 a853868671@gmail.com
 * @since 2019-03-21
 */
@TableName("vw_rent_evaluate")
public class RentEvaluate extends BaseEntity {
    /**
     * vw_rent_vehicle表id
     */
    private String vid;
    /**
     * 用户主键
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 评价内容
     */
    private String content;
    /**
     * 图片地址
     */
    private String images;
    /**
     * 排序
     */
    private Integer order;
    /**
     * 0显示，1不显示
     */
    private Integer status;


    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RentEvaluate{" +
        ", vid=" + vid +
        ", userId=" + userId +
        ", content=" + content +
        ", images=" + images +
        ", order=" + order +
        ", status=" + status +
        "}";
    }
}
