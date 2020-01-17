package com.vw.rent.enums.FawLeasing;

/**  
 * 职业
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum OccupationEnum {
    ONE("1", "单位负责人"),
    TWO("2", "部门负责人"),
    THREE("3", "一般员工"),
    FOUR("4", "其他"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    OccupationEnum(String value, String description) {
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

    public static OccupationEnum getByValue(String value) {
        if (null == value)
            return null;
        for (OccupationEnum _enum : OccupationEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static OccupationEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (OccupationEnum _enum : OccupationEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
