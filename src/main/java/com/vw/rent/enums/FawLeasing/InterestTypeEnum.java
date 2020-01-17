package com.vw.rent.enums.FawLeasing;

/**  
 * 计息方式
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum InterestTypeEnum {

    ONE("320", "平均还款"),
    TWO("326", "尾款还款"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    InterestTypeEnum(String value, String description) {
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

    public static InterestTypeEnum getByValue(String value) {
        if (null == value)
            return null;
        for (InterestTypeEnum _enum : InterestTypeEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static InterestTypeEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (InterestTypeEnum _enum : InterestTypeEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
