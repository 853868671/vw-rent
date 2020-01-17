package com.vw.rent.enums.newPower;

/**  
 * 租期
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum TenorEnum {
    TWELVE("12", "12个月"),
    TWENTY_FOUR("24", "24个月"),
    THIRTY_SIX("36", "36个月"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    TenorEnum(String value, String description) {
        this.value = value;
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

    /**
     * 获取描述信息
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public static TenorEnum getByValue(String value) {
        if (null == value)
            return null;
        for (TenorEnum _enum : TenorEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static TenorEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (TenorEnum _enum : TenorEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
