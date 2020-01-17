package com.vw.rent.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.vw.rent.utils.base.BaseEntity;

import java.math.BigDecimal;

/**
 * <p>
 * 租赁车型表
 * </p>
 *
 * @author 王卫东 a853868671@gmail.com
 * @since 2019-03-21
 */
@TableName("vw_rent_vehicle")
public class RentVehicle extends BaseEntity {
    /**
     * 车型
     */
    private String name;
    /**
     * 版本
     */
    private String version;
    /**
     * 变速箱
     */
    private String trans;
    /**
     * 汽车排量
     */
    private String displacement;
    /**
     * 发动机
     */
    private String engine;
    /**
     * 马力
     */
    @TableField("horse_power")
    private String horsePower;
    /**
     * 指导价格
     */
    private BigDecimal price;
    /**
     * 车辆状态 0下架 1上架
     */
    private Integer status;
    /**
     * 0未删除 1删除
     */
    @TableField("is_del")
    private Integer isDel;
    /**
     * 排序
     */
    private Integer order;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "RentVehicle{" +
        ", name=" + name +
        ", version=" + version +
        ", trans=" + trans +
        ", displacement=" + displacement +
        ", engine=" + engine +
        ", horsePower=" + horsePower +
        ", price=" + price +
        ", status=" + status +
        ", isDel=" + isDel +
        ", order=" + order +
        "}";
    }
}
