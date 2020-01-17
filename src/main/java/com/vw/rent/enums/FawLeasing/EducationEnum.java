package com.vw.rent.enums.FawLeasing;

/**  
 * 受教育成都
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum EducationEnum {
    ONE("1", "研究生（含以上）"),
    TWO("2", "大学本科"),
    THREE("3", "大学专科"),
    FOUR("4", "中专/高中"),
    FIVE("5", "高中以下"),
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
