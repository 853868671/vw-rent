package com.vw.rent.dto;

import com.vw.rent.utils.base.PojoBaseEntity;

import java.math.BigDecimal;

public class NewPowerRequestDTO extends PojoBaseEntity {
    // 客户姓名
    private String contactName;
    // 客户手机号
    private String contactPhoneNumber;
    // 车型
    private int modelId;
    // 车型描述
    private int variantId;
    // 车辆销售价格
    private BigDecimal vehiclePrice;
    // 购买数量
    private int vehicleCount;
    // 融资期限（月）
    private int tenor;
    // 融资金额
    private BigDecimal totalAmount;
    // 月供
    private BigDecimal monthlyInstallment;
    // 利率（%）
    private double interestRate;
    // 首付款金额
    private BigDecimal downPaymentAmount;
    // 首付款比例（g %）
    private double downPaymentRatio;
    // 尾款金额
    private BigDecimal balloonAmount;
    // 经销商名
    private String dealerName;
    // 证件类型
    private String idDocumentType;
    // 出生日期
    private String birthday;
    // 证件号码
    private String idNumber;
    // 婚姻状况
    private String maritalStatus;
    // 电子邮箱
    private String email;
    // 省 (需要映射字段)
    private int provinceId;
    // 市 （需要映射字段）
    private int cityId;
    // 联系地址
    private String contactAddress;
    // 房产类型
    private String housePropertyType;
    // 行业信息
    private String industryCode;
    // 工作单位名称
    private String employerName;
    // 工作单位地址
    private String companyAddress;
    // 月总收入
    private BigDecimal monthlyIncome;
    // 月总支出
    private BigDecimal monthlyExpense;
    // 居住时间年
    private int residenceYear;
    // 居住时间月
    private int residenceMonth;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getVariantId() {
        return variantId;
    }

    public void setVariantId(int variantId) {
        this.variantId = variantId;
    }

    public BigDecimal getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(BigDecimal vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public int getTenor() {
        return tenor;
    }

    public void setTenor(int tenor) {
        this.tenor = tenor;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(BigDecimal monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(BigDecimal downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public double getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(double downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public BigDecimal getBalloonAmount() {
        return balloonAmount;
    }

    public void setBalloonAmount(BigDecimal balloonAmount) {
        this.balloonAmount = balloonAmount;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(String idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getHousePropertyType() {
        return housePropertyType;
    }

    public void setHousePropertyType(String housePropertyType) {
        this.housePropertyType = housePropertyType;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public BigDecimal getMonthlyExpense() {
        return monthlyExpense;
    }

    public void setMonthlyExpense(BigDecimal monthlyExpense) {
        this.monthlyExpense = monthlyExpense;
    }

    public int getResidenceYear() {
        return residenceYear;
    }

    public void setResidenceYear(int residenceYear) {
        this.residenceYear = residenceYear;
    }

    public int getResidenceMonth() {
        return residenceMonth;
    }

    public void setResidenceMonth(int residenceMonth) {
        this.residenceMonth = residenceMonth;
    }
}

