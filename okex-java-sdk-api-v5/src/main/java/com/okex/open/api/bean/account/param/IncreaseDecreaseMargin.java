package com.okex.open.api.bean.account.param;

import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.account.AdjustType;
import com.okex.open.api.bean.account.PositionSide;

public class IncreaseDecreaseMargin {
    private String instId;
    private PositionSide posSide;
    private AdjustType type;
    @SerializedName("amt")
    private String amount;
    private Boolean loanTrans;
    @SerializedName("ccy")
    private String currency;
    private Boolean auto;

    @Override
    public String toString() {
        return "IncreaseDecreaseMargin{" +
                "instId='" + instId + '\'' +
                ", posSide='" + posSide + '\'' +
                ", type='" + type + '\'' +
                ", amt='" + amount + '\'' +
                ", loanTrans=" + loanTrans +
                ", ccy='" + currency + '\'' +
                ", auto=" + auto +
                '}';
    }

    public String getCcy() {
        return currency;
    }

    public void setCcy(String ccy) {
        this.currency = ccy;
    }

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    public Boolean getLoanTrans() {
        return loanTrans;
    }

    public void setLoanTrans(Boolean loanTrans) {
        this.loanTrans = loanTrans;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public PositionSide getPosSide() {
        return posSide;
    }

    public void setPosSide(PositionSide posSide) {
        this.posSide = posSide;
    }

    public AdjustType getType() {
        return type;
    }

    public void setType(AdjustType type) {
        this.type = type;
    }

    public String getAmt() {
        return amount;
    }

    public void setAmt(String amt) {
        this.amount = amt;
    }


}
