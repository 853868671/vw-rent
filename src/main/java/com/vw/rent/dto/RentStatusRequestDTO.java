package com.vw.rent.dto;

import com.vw.rent.utils.base.PojoBaseEntity;

/**
 * 租赁回调请求参数
 * @author 王卫东 a853868671@gmail.com
 * @date 19-3-22i
 */
public class RentStatusRequestDTO extends PojoBaseEntity {
    /**
     * 状态：
     *   枚举值：
     *      AUDIT_STAGE("1", "审核阶段"),
     *      PAY_STAGE("2", "支付阶段"),
     *      ON_HIRE("3", "起租阶段"),
     *      LEASING_END("4", "租赁结束阶段"),
     */
    private int status;
    // 订单号: 金融方提供唯一标识
    private String serialNo;
    // 失败原因：可以为空
    private String msg;
    // 金融方
    private String financeName;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }
}
