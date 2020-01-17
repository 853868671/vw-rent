package com.vw.rent.enums.newPower;

/**  
 * 车用途
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum VehicleUsageEnum {

    ONE("1", "商用"),
    TWO("2", "自用"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    VehicleUsageEnum(String value, String description) {
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

    public static VehicleUsageEnum getByValue(String value) {
        if (null == value)
            return null;
        for (VehicleUsageEnum _enum : VehicleUsageEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static VehicleUsageEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (VehicleUsageEnum _enum : VehicleUsageEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
