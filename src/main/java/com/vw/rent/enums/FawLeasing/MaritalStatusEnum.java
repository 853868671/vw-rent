package com.vw.rent.enums.FawLeasing;

/**  
 * 婚姻状态
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum MaritalStatusEnum {
    ONE("1", "已婚有子女"),
    TWO("2", "已婚无子女"),
    THREE("3", "离异"),
    FOUR("4", "单身"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    MaritalStatusEnum(String value, String description) {
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

    public static MaritalStatusEnum getByValue(String value) {
        if (null == value)
            return null;
        for (MaritalStatusEnum _enum : MaritalStatusEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static MaritalStatusEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (MaritalStatusEnum _enum : MaritalStatusEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
