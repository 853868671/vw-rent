package com.vw.rent.enums.newPower;

/**  
 * 受教育成都
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum EducationEnum {
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

    EducationEnum(String value, String description) {
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

    public static EducationEnum getByValue(String value) {
        if (null == value)
            return null;
        for (EducationEnum _enum : EducationEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static EducationEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (EducationEnum _enum : EducationEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
