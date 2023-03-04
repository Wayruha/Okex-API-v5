package com.okex.open.api.bean.account.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountBalance {
    @SerializedName("adjEq")
    private String totalUsdAmount;
    @SerializedName("imr")
    private String initMarginRequirement;
    @SerializedName("isoEq")
    private String isoAmount;
    private String mgnRatio;
    @SerializedName("mmr")
    private String minimalMarginRequirement;
    private String notionalUsd;
    @SerializedName("ordFroz")
    private String crossmOrderFrozen;
    @SerializedName("totalEq")
    private String totalAmount;
    private String uTime;
    private List<Details> details;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Details {
        private String availBal;
        private String availEq;
        private String cashBal;
        @SerializedName("ccy")
        private String currency;
        private String crossLiab;
        @SerializedName("disEq")
        private String discountAmount;
        @SerializedName("eq")
        private String amount;
        @SerializedName("eqUsd")
        private String usdAmount;
        private String frozenBal;
        private String interest;
        private String isoEq;
        private String isoLiab;
        @SerializedName("isoUpl")
        private String unrealizedIsolatedProfit;
        private String liab;
        private String maxLoan;
        private String mgnRatio;
        private String notionalLever;
        @SerializedName("ordFrozen")
        private String ordFrozen;
        private String twap;
        private String uTime;
        @SerializedName("upl")
        private String unrealizedProfit;
        @SerializedName("uplLiab")
        private String unrealizedLossLiability;
        @SerializedName("stgyEq")
        private String strategyAmount;
        private String spotInUseAmt;
    }
}
