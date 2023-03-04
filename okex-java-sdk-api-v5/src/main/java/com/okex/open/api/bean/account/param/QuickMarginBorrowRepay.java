package com.okex.open.api.bean.account.param;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class QuickMarginBorrowRepay {
    private String instId;
    @SerializedName("ccy")
    private String currency;
    private Side side;
    @SerializedName("amt")
    private String amount;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "QuickMarginBorrowRepay{" +
                "instId='" + instId + '\'' +
                ", ccy='" + currency + '\'' +
                ", side='" + side + '\'' +
                ", amt='" + amount + '\'' +
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
