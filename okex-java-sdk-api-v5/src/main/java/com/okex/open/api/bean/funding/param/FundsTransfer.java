package com.okex.open.api.bean.funding.param;

import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.funding.Direction;

public class FundsTransfer {
    @SerializedName("ccy")
    private String currency;
    @SerializedName("amt")
    private String amount;
    private String type;
    private Direction from;
    private Direction to;
    @SerializedName("subAcct")
    private String subAccountName;
    private String clientId;
    private Boolean loanTrans;

    public String getOmitPosRisk() {
        return omitPosRisk;
    }

    public void setOmitPosRisk(String omitPosRisk) {
        this.omitPosRisk = omitPosRisk;
    }

    private String omitPosRisk;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Boolean getLoanTrans() {
        return loanTrans;
    }

    public void setLoanTrans(Boolean loanTrans) {
        this.loanTrans = loanTrans;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Direction getFrom() {
        return from;
    }

    public void setFrom(Direction from) {
        this.from = from;
    }

    public Direction getTo() {
        return to;
    }

    public void setTo(Direction to) {
        this.to = to;
    }

    public String getSubAccountName() {
        return subAccountName;
    }

    public void setSubAccountName(String subAccountName) {
        this.subAccountName = subAccountName;
    }



    @Override
    public String toString() {
        return "FundsTransfer{" +
                "ccy='" + currency + '\'' +
                ", amt='" + amount + '\'' +
                ", type='" + type + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subAcct='" + subAccountName + '\'' +
                ", instId='" + clientId + '\'' +
                ", loanTrans=" + loanTrans +
                '}';
    }
}
