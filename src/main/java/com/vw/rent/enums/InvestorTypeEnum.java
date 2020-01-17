package com.vw.rent.enums;

/**  
 * 投资者类型
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum InvestorTypeEnum {
    GOVERNMENT("101","1","政府机构"),
    STATE_OWNED("202","2", "国有企业"),
    PRIVATELY_OWNED("303","4", "私有企业"),
    FOREIGN_MERCHANT("404","3","外商投资企业"),
    SELF_EMPLOYED("505","5", "自雇"),
    OTHER("9090","6", "其他"),
    ;

    /**
     * 值 String型
     */
    private final String value;

    private final String val;
    /**
     * 描述 String型
     */
    private final String description;

    InvestorTypeEnum(String value,String val,String description) {
        this.value = value;
        this.val = val;
        this.description = description;
    }

    /**
     * 获取值
     *
     * @return value
     */
    public String getValue() {
        return value;
    }

    public String getVal() {
        return val;
    }

    /**
     * 获取描述信息
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public static InvestorTypeEnum getByValue(String value) {
        if (null == value)
            return null;
        for (InvestorTypeEnum _enum : InvestorTypeEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static InvestorTypeEnum getByVal(String val) {
        if (null == val)
            return null;
        for (InvestorTypeEnum _enum : InvestorTypeEnum.values()) {
            if (val.equals(_enum.getVal()))
                return _enum;
        }
        return null;
    }

    public static InvestorTypeEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (InvestorTypeEnum _enum : InvestorTypeEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
