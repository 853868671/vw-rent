package com.vw.rent.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 圣承集团2019年年中会议使用的表
 * </p>
 *
 * @author wwd
 * @since 2020-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("vw_mid_year")
@ApiModel(description = "年")
public class MidYear extends Model<MidYear> {

    private static final long serialVersionUID = 1L;



    /**
     * 被打赏人姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 打赏的金额
     */
    @ApiModelProperty(value = "增值金额")
    private BigDecimal price;

    /**
     * 最后打赏的时间
     */

    private Long update;

    /**
     * 钱的上限
     */
    private BigDecimal upper;


    @Override
    protected Serializable pkVal() {
        return null;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getUpdate() {
        return update;
    }

    public void setUpdate(Long update) {
        this.update = update;
    }

    public BigDecimal getUpper() {
        return upper;
    }

    public void setUpper(BigDecimal upper) {
        this.upper = upper;
    }
}
