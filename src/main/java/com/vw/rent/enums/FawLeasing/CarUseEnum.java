package com.vw.rent.enums.FawLeasing;

/**  
 * 性别
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum CarUseEnum {

    ONE("1672", "家庭乘用"),
    TWO("1673", "办公乘用"),
    THREE("1674", "商用"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    CarUseEnum(String value, String description) {
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

    public static CarUseEnum getByValue(String value) {
        if (null == value)
            return null;
        for (CarUseEnum _enum : CarUseEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static CarUseEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (CarUseEnum _enum : CarUseEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
