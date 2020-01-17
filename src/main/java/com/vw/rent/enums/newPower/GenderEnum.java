package com.vw.rent.enums.newPower;

/**  
 * 性别
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum GenderEnum {

    F("F", "女性"),
    M("M", "男性"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    GenderEnum(String value, String description) {
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

    public static GenderEnum getByValue(String value) {
        if (null == value)
            return null;
        for (GenderEnum _enum : GenderEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static GenderEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (GenderEnum _enum : GenderEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
