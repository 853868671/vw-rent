package com.vw.rent.enums;

/**
 * 租赁阶段
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum RentStageEnum {

    AUDIT_STAGE("1", "审核阶段"),
    PAY_STAGE("2", "支付阶段"),
    ON_HIRE("3", "起租阶段"),
    LEASING_END("4", "租赁结束阶段"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    RentStageEnum(String value, String description) {
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

    public static RentStageEnum getByValue(String value) {
        if (null == value)
            return null;
        for (RentStageEnum _enum : RentStageEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static RentStageEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (RentStageEnum _enum : RentStageEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
