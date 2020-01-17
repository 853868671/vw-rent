package com.vw.rent.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wwd
 * @since 2020-01-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("vw_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * Toekn
     */
    private String token;

    /**
     * faw_vw token
     */
    @TableField("access_token")
    private String accessToken;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 用户名
     */
    private String username;

    /**
     * 大众会员码
     */
    private String usercode;

    /**
     * VW uid
     */
    @TableField("vw_uid")
    private Integer vwUid;

    /**
     * VW aid
     */
    @TableField("vw_aid")
    private Integer vwAid;

    private String realname;

    /**
     * 身份证号码
     */
    @TableField("id_card_no")
    private String idCardNo;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 加密串
     */
    private String encrypt;

    /**
     * 用户头像
     */
    private String avatar;

    private String province;

    private String city;

    private String address;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 创建时间
     */
    private Integer createdate;

    /**
     * 1-本站注册,2-小程序，3-其它
     */
    @TableField("reg_type")
    private Integer regType;

    /**
     * 会员数据来源
     */
    private String registdatafrom;

    /**
     * 最后登陆ip
     */
    @TableField("last_login_ip")
    private String lastLoginIp;

    /**
     * 最后登录时间
     */
    @TableField("last_login_date")
    private Integer lastLoginDate;

    /**
     * 是否已认证：1-未认证|2-已认证 
     */
    private String iscertified;

    /**
     * 认证审核不通过原因
     */
    private String reson;

    /**
     * 认证审核时间
     */
    private String approvaltime;

    /**
     * 认证审核状态：0-待审核|1-审核通过|2-审核未通过
     */
    private Integer approval;

    /**
     * 认证时间
     */
    private String certifiedtime;

    /**
     * 身份证照片地址
     */
    private String idcardphoto;

    /**
     * 1-男|2-女
     */
    private Integer sex;

    private Integer age;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
