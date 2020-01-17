package com.vw.rent.enums.newPower;

/**  
 * 职业
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum OccupationEnum {
    MANAGER("1010", "经理（没有股份）"),
    PROFESSOR("1111", "教授（医生.老师）"),
    REGISTRAR("1212", "职业注册师"),
    FREELANCER("1313", "自由职业者"),
    SELF_EMPLOYED("1414", "自雇"),
    CIVIL("1515", "公务员"),
    EMPLOYEE("1616", "雇员"),
    WORKER("1717", "工人"),
    LEGAL("1818", "法定代表人"),
    MANAGER_HOLDING("1919", "经理（持股超20%）"),
    OTHER("9090", "其他"),
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
