package com.vw.rent.dto;

import org.springframework.web.multipart.MultipartFile;

public class NewPowerRequestWithFileDTO extends NewPowerRequestDTO {
    // 身份证正面
    private MultipartFile idFront;
    // 身份证背面
    private MultipartFile idBack;
    // 驾驶证
    private MultipartFile drivingLicence;
    // 身份证正面存放路径
    private String idFrontPath;
    // 身份证背面存放路径
    private String idBackPath;
    // 驾驶证存放路径
    private String drivingLicencePath;

    public MultipartFile getIdFront() {
        return idFront;
    }

    public void setIdFront(MultipartFile idFront) {
        this.idFront = idFront;
    }

    public MultipartFile getIdBack() {
        return idBack;
    }

    public void setIdBack(MultipartFile idBack) {
        this.idBack = idBack;
    }

    public MultipartFile getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(MultipartFile drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public String getIdFrontPath() {
        return idFrontPath;
    }

    public void setIdFrontPath(String idFrontPath) {
        this.idFrontPath = idFrontPath;
    }

    public String getIdBackPath() {
        return idBackPath;
    }

    public void setIdBackPath(String idBackPath) {
        this.idBackPath = idBackPath;
    }

    public String getDrivingLicencePath() {
        return drivingLicencePath;
    }

    public void setDrivingLicencePath(String drivingLicencePath) {
        this.drivingLicencePath = drivingLicencePath;
    }
}

