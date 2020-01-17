package com.vw.rent.enums;

/**
 * 金融公司
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum FinanceNameEnum {

    NEW_POWER("newPower", "审核阶段"),
    FAW_LEASING("fawLeasing", "一汽租赁"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    FinanceNameEnum(String value, String description) {
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

    public static FinanceNameEnum getByValue(String value) {
        if (null == value)
            return null;
        for (FinanceNameEnum _enum : FinanceNameEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static FinanceNameEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (FinanceNameEnum _enum : FinanceNameEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }

        return null;
    }
}
