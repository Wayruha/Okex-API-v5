package com.okex.open.api.bean.account.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class InterestAndBorrowLimit {
    private String debt;
    private String interest;
    private String nextDiscountTime;
    private String nextInterestTime;
    private List<Record> records;

    @Data
    public static class Record {
        @SerializedName("availLoan")
        private String availableLoan;
        @SerializedName("ccy")
        private String currency;
        private String interest;
        private String loanQuota;
        private String posLoan;
        private String rate;
        @SerializedName("surplusLmt")
        private String surplusLimit;
        @SerializedName("usedLmt")
        private String usedLimit;
        private String usedLoan;
    }
}
