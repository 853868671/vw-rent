package com.vw.rent.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.vw.rent.utils.base.BaseEntity;

/**
 * <p>
 * 租赁车型图片表
 * </p>
 *
 * @author 王卫东 a853868671@gmail.com
 * @since 2019-03-21
 */
@TableName("vw_rent_vehicle_image")
public class RentVehicleImage extends BaseEntity {
    /**
     * vw_rent_vehicle表id
     */
    private String vid;
    /**
     * 0显示，1不显示
     */
    private Integer status;
    /**
     * 0是图片 1是视频
     */
    private Integer type;
    /**
     * 图片地址
     */
    @TableField("image_url")
    private String imageUrl;
    /**
     * 视频地址
     */
    @TableField("video_url")
    private String videoUrl;
    /**
     * 排序
     */
    private Integer order;


    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "RentVehicleImage{" +
        ", vid=" + vid +
        ", status=" + status +
        ", type=" + type +
        ", imageUrl=" + imageUrl +
        ", videoUrl=" + videoUrl +
        ", order=" + order +
        "}";
    }
}
