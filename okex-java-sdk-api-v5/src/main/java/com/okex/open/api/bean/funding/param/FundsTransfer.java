package com.okex.open.api.bean.funding.param;

import com.okex.open.api.bean.funding.Direction;

public class FundsTransfer {
    private String ccy;
    private String amt;
    private String type;
    private Direction from;
    private Direction to;
    private String subAcct;
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

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
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

    public String getSubAcct() {
        return subAcct;
    }

    public void setSubAcct(String subAcct) {
        this.subAcct = subAcct;
    }



    @Override
    public String toString() {
        return "FundsTransfer{" +
                "ccy='" + ccy + '\'' +
                ", amt='" + amt + '\'' +
                ", type='" + type + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subAcct='" + subAcct + '\'' +
                ", instId='" + clientId + '\'' +
                ", loanTrans=" + loanTrans +
                '}';
    }
}
