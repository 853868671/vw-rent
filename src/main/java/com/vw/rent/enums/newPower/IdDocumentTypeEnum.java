package com.vw.rent.enums.newPower;

/**  
 * 证件类型
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum IdDocumentTypeEnum {

    one("1", "中华人民共和国居民身份证"),
    three("3", "护照"),
    five("5", "港澳居民来往内地通行证"),
    six("6", "台湾同胞来往内地通行证"),
    ;

    /**
     * 值 String型
     */
    private final String value;
    /**
     * 描述 String型
     */
    private final String description;

    IdDocumentTypeEnum(String value, String description) {
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

    public static IdDocumentTypeEnum getByValue(String value) {
        if (null == value)
            return null;
        for (IdDocumentTypeEnum _enum : IdDocumentTypeEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static IdDocumentTypeEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (IdDocumentTypeEnum _enum : IdDocumentTypeEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
