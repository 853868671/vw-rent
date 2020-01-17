package com.vw.rent.enums.newPower;

/**  
 * 住房类型
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum HousePropertyTypeEnum {
    UNDERGRADUATE_ON("01", "本科以上"),
    UNDERGRADUATE("02", "本科"),
    UNDERGRADUATE_UNDER("03", "本科以下"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    HousePropertyTypeEnum(String value, String description) {
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

    public static HousePropertyTypeEnum getByValue(String value) {
        if (null == value)
            return null;
        for (HousePropertyTypeEnum _enum : HousePropertyTypeEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static HousePropertyTypeEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (HousePropertyTypeEnum _enum : HousePropertyTypeEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
