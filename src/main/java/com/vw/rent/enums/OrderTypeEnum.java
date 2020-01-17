package com.vw.rent.enums;

/**
 * 租赁阶段
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum OrderTypeEnum {

    NEW_ENERGY(1, "新能源"),
    FUEL_OLL(2, "燃油"),
    OTHER(3, "其他"),
    ;

    /**
     * 值 String型
     */
    private final int value;
    /**
     * 描述 String型
     */
    private final String description;

    OrderTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * 获取值
     *
     * @return value
     */
    public int getValue() {
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

    public static OrderTypeEnum getByValue(int value) {
        for (OrderTypeEnum _enum : OrderTypeEnum.values()) {
            if (value == _enum.getValue())
                return _enum;
        }
        return null;
    }

    public static OrderTypeEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (OrderTypeEnum _enum : OrderTypeEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
