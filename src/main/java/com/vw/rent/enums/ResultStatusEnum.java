package com.vw.rent.enums;

/**
 * 租赁阶段
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum ResultStatusEnum {

    SUCCESS("0", "成功"),
    FAIL("1", "失败"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    ResultStatusEnum(String value, String description) {
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

    public static ResultStatusEnum getByValue(String value) {
        if (null == value)
            return null;
        for (ResultStatusEnum _enum : ResultStatusEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static ResultStatusEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (ResultStatusEnum _enum : ResultStatusEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
