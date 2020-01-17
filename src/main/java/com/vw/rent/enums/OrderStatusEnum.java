package com.vw.rent.enums;

/**
 * 租赁阶段
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum OrderStatusEnum {

    AUDITING(0, "审核中"),
    AUDITED(1, "审核通过"),
    PAYED(2, "已支付"),
    IN_PRODUCTION(3, "车辆生产中"),
    PRODUCTION_COMPLETION(4, "车辆生产完"),
    REACH_STORE(5, "车辆已到店"),
    RENTING(6, "租赁中"),
    RENT_END(7, "租赁结束"),
    CANCEL_ORDER(-1, "取消订单"),
    ;

    /**
     * 值 int型
     */
    private final int value;
    /**
     * 描述 String型
     */
    private final String description;

    OrderStatusEnum(int value, String description) {
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

    public static OrderStatusEnum getByValue(int value) {
        if (value < 0)
            return null;
        for (OrderStatusEnum _enum : OrderStatusEnum.values()) {
            if (value == _enum.getValue())
                return _enum;
        }
        return null;
    }

    public static OrderStatusEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (OrderStatusEnum _enum : OrderStatusEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
