package com.okex.open.api.bean.account.param;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class QuickMarginBorrowRepay {
    private String instId;
    private String ccy;
    private Side side;
    private String amt;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return "QuickMarginBorrowRepay{" +
                "instId='" + instId + '\'' +
                ", ccy='" + ccy + '\'' +
                ", side='" + side + '\'' +
                ", amt='" + amt + '\'' +
                '}';
    }

    public enum Side {
        @SerializedName("borrow")
        BORROW("borrow"),
        @SerializedName("repay")
        REPAY("repay");

        private String code;

        Side(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return code;
        }
    }
}
