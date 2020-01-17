package com.vw.rent.enums.FawLeasing;

/**
 * 购车城市与户口所在地是否一致枚举
 */
public enum CarCityEnum {
    ONE("1", "本市"),
    TWO("2", "非本市"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    CarCityEnum(String value, String description) {
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

    public static CarCityEnum getByValue(String value) {
        if (null == value)
            return null;
        for (CarCityEnum _enum : CarCityEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static CarCityEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (CarCityEnum _enum : CarCityEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
