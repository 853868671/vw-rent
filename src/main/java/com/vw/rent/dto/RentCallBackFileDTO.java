package com.vw.rent.dto;

import com.vw.rent.utils.base.PojoBaseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * 金融方回调上传文件实体
 */
public class RentCallBackFileDTO extends PojoBaseEntity{
    // 订单号: 金融方提供唯一标识
    private String serialNo;

    // 合同文件
    private MultipartFile file;

    // 金融方
    private String financeName;

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
