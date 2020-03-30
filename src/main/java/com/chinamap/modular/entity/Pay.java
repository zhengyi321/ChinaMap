package com.chinamap.modular.entity;

import java.util.Date;

public class Pay {
    private Integer id;

    private String payWay;

    private String thirdTransactionId;

    private String payPrice;

    private Date payTime;

    private String payPlace;

    private String payApp;

    private String payDeviceInfo;

    private Boolean payIsSuccess;

    private String payOrderId;

    private String thirdMchId;

    private String payAccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getThirdTransactionId() {
        return thirdTransactionId;
    }

    public void setThirdTransactionId(String thirdTransactionId) {
        this.thirdTransactionId = thirdTransactionId == null ? null : thirdTransactionId.trim();
    }

    public String getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(String payPrice) {
        this.payPrice = payPrice == null ? null : payPrice.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayPlace() {
        return payPlace;
    }

    public void setPayPlace(String payPlace) {
        this.payPlace = payPlace == null ? null : payPlace.trim();
    }

    public String getPayApp() {
        return payApp;
    }

    public void setPayApp(String payApp) {
        this.payApp = payApp == null ? null : payApp.trim();
    }

    public String getPayDeviceInfo() {
        return payDeviceInfo;
    }

    public void setPayDeviceInfo(String payDeviceInfo) {
        this.payDeviceInfo = payDeviceInfo == null ? null : payDeviceInfo.trim();
    }

    public Boolean getPayIsSuccess() {
        return payIsSuccess;
    }

    public void setPayIsSuccess(Boolean payIsSuccess) {
        this.payIsSuccess = payIsSuccess;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId == null ? null : payOrderId.trim();
    }

    public String getThirdMchId() {
        return thirdMchId;
    }

    public void setThirdMchId(String thirdMchId) {
        this.thirdMchId = thirdMchId == null ? null : thirdMchId.trim();
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }
}