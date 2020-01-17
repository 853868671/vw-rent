package com.vw.rent.enums;

/**  
 * 工作行业
 * @author 王卫东 a853868671@gmail.com
 * @date 18-3-21
 */
public enum IndustryCodeEnum {
    FARMING("10001000","A","农、林、牧、渔业"),
    MINING("11001100","B", "采矿业"),
    MANUFACTURING("12001200","C", "制造业"),
    ELECTRICITY("13001300","D", "电力燃气及水生产供应"),
    ARCHITECTURE("14001400","E","建筑业"),
    TRAFFIC("15001500","F", "交通运输仓储和邮政业"),
    SOFT("16001600","G", "信息计算机服务和软件"),
    WHOLESALE("17001700","H", "批发和零售业"),
    STAY("18001800","I", "住宿和餐饮业"),
    FINANCIAL_INDUSTRY("19001900","J", "金融业"),
    REAL_ESTATE("20002000","K", "房地产业"),
    LEASING("21002100","L", "租赁和商务服务业"),
    SCIENCE_TECHNOLOGY("22002200","M", "科学技术和地址勘察业"),
    UTILITY("23002300","N", "水利、环境和公共设施"),
    RESIDENT_SERVICE("24002400","O", "居民服务和其他服务业"),
    EDUCATION("25002500","P", "教育"),
    SANITATION("26002600","Q", "卫生、社会保障和社会福利业"),
    CULTURE("27002700","R", "文化、体育和娱乐业"),
    PUBLIC_MANAGEMENT("28002800","S", "公共管理和社会组织"),
    INTERNATIONAL_ORGANIZATION("29002900","T", "国际组织"),
    UNKNOWN("9090","U", "未知"),
    ;

    /**
     * 值 String型
     */
    private final String value;

    private final String val;
    /**
     * 描述 String型
     */
    private final String description;

    IndustryCodeEnum(String value,String val, String description) {
        this.value = value;
        this.val = val;
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

    public String getVal() {
        return val;
    }

    /**
     * 获取描述信息
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public static IndustryCodeEnum getByValue(String value) {
        if (null == value)
            return null;
        for (IndustryCodeEnum _enum : IndustryCodeEnum.values()) {
            if (value.equals(_enum.getValue()))
                return _enum;
        }
        return null;
    }

    public static IndustryCodeEnum getByVal(String val) {
        if (null == val)
            return null;
        for (IndustryCodeEnum _enum : IndustryCodeEnum.values()) {
            if (val.equals(_enum.getVal()))
                return _enum;
        }
        return null;
    }

    public static IndustryCodeEnum getByDescription(String description) {
        if (null == description)
            return null;
        for (IndustryCodeEnum _enum : IndustryCodeEnum.values()) {
            if (description.equals(_enum.getDescription()))
                return _enum;
        }
        return null;
    }
}
