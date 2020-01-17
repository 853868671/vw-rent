package com.vw.rent.enums.newPower;

/**  
 * 放款目标
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum LoanTargetEnum {
    ONE("1", "车辆卖方"),
    TWO("2", "客户"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    LoanTargetEnum(String value, String description) {
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

    public static LoanTargetEnum getByValue(String value) {
        if (null == value)
            return null;
        for (LoanTargetEnum _enum : LoanTargetEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static LoanTargetEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (LoanTargetEnum _enum : LoanTargetEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
