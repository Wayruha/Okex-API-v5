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
    private String isolatedAmount;
    @SerializedName("mgnRatio")
    private String marginRatio;
    @SerializedName("mmr")
    private String minimalMarginRequirement;
    private String notionalUsd;
    @SerializedName("ordFroz")
    private String orderFrozenQty;
    @SerializedName("totalEq")
    private String totalAmount;
    private String uTime;
    private List<Details> details;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Details {
        @SerializedName("availBal")
        private String availableBalance;
        @SerializedName("availEq")
        private String availableEquity;
        @SerializedName("cashBal")
        private String cashBalance;
        @SerializedName("ccy")
        private String currency;
        @SerializedName("crossLiab")
        private String crossLiability;
        @SerializedName("disEq")
        private String discountAmount;
        @SerializedName("eq")
        private String equity;
        @SerializedName("eqUsd")
        private String usdAmount;
        @SerializedName("frozenBal")
        private String frozenBalance;
        private String interest;
        @SerializedName("isoEq")
        private String isolatedEquity;
        @SerializedName("isoLiab")
        private String isolatedLiability;
        @SerializedName("isoUpl")
        private String unrealizedIsolatedProfit;
        @SerializedName("liab")
        private String liabilities;
        private String maxLoan;
        @SerializedName("mgnRatio")
        private String marginRatio;
        @SerializedName("notionalLever")
        private String notionalLeverage;
        @SerializedName("ordFrozen")
        private String orderMarginFrozen;
        @SerializedName("twap")
        private String twapIndicator;
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
