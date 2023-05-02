package com.okex.open.api.bean.funding.param;

import com.google.gson.annotations.SerializedName;

public class Withdrawal {
    @SerializedName("ccy")
    private String currency;
    private String chain;
    @SerializedName("amt")
    private String amount;
    @SerializedName("dest")
    private Destination destination;
    @SerializedName("toAddr")
    private String toAddress;
    private String clientId;
    @SerializedName("wdId")
    private String withdrawalId;

    private String areaCode;

    public enum Destination {
        @SerializedName("3")
        INTERNAL("3"),
        @SerializedName("4")
        ON_CHAIN("4");

        private String code;

        Destination(String code) {
            this.code = code;
        }

        public String toString() {
            return code;
        }
    }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "ccy='" + currency + '\'' +
                ", chain='" + chain + '\'' +
                ", amt='" + amount + '\'' +
                ", dest='" + destination + '\'' +
                ", toAddr='" + toAddress + '\'' +
                ", clientId='" + clientId + '\'' +
                ", wdId='" + withdrawalId + '\'' +
                ", invoice='" + invoice + '\'' +
                ", fee='" + fee + '\'' +
                ", areaCode='" + areaCode + '\'' +
                '}';
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(String withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    private String invoice;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    private String fee;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
}
