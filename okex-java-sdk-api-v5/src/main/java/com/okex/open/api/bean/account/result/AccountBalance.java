package com.okex.open.api.bean.account.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("adjEq")
    private String totalUsdAmount;
    @SerializedName("imr")
    @JsonProperty("imr")
    private String initMarginRequirement;
    @SerializedName("isoEq")
    @JsonProperty("isoEq")
    private String isolatedAmount;
    @SerializedName("mgnRatio")
    @JsonProperty("mgnRatio")
    private String marginRatio;
    @SerializedName("mmr")
    @JsonProperty("mmr")
    private String minimalMarginRequirement;
    private String notionalUsd;
    @SerializedName("ordFroz")
    @JsonProperty("ordFroz")
    private String orderFrozenQty;
    @SerializedName("totalEq")
    @JsonProperty("totalEq")
    private String totalAmount;
    private String uTime;
    private List<Details> details;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Details {
        @SerializedName("availBal")
        @JsonProperty("availBal")
        private String availableBalance;
        @SerializedName("availEq")
        @JsonProperty("availEq")
        private String availableEquity;
        @SerializedName("cashBal")
        @JsonProperty("cashBal")
        private String cashBalance;
        @SerializedName("ccy")
        @JsonProperty("ccy")
        private String currency;
        @SerializedName("crossLiab")
        @JsonProperty("crossLiab")
        private String crossLiability;
        @SerializedName("disEq")
        @JsonProperty("disEq")
        private String discountAmount;
        @SerializedName("eq")
        @JsonProperty("eq")
        private String equity;
        @SerializedName("eqUsd")
        @JsonProperty("eqUsd")
        private String usdAmount;
        @SerializedName("frozenBal")
        @JsonProperty("frozenBal")
        private String frozenBalance;
        private String interest;
        @SerializedName("isoEq")
        @JsonProperty("isoEq")
        private String isolatedEquity;
        @SerializedName("isoLiab")
        @JsonProperty("isoLiab")
        private String isolatedLiability;
        @SerializedName("isoUpl")
        @JsonProperty("isoUpl")
        private String unrealizedIsolatedProfit;
        @SerializedName("liab")
        @JsonProperty("liab")
        private String liabilities;
        private String maxLoan;
        @SerializedName("mgnRatio")
        @JsonProperty("mgnRatio")
        private String marginRatio;
        @SerializedName("notionalLever")
        @JsonProperty("notionalLever")
        private String notionalLeverage;
        @SerializedName("ordFrozen")
        @JsonProperty("ordFrozen")
        private String orderMarginFrozen;
        @SerializedName("twap")
        @JsonProperty("twap")
        private String twapIndicator;
        private String uTime;
        @SerializedName("upl")
        @JsonProperty("upl")
        private String unrealizedProfit;
        @SerializedName("uplLiab")
        @JsonProperty("uplLiab")
        private String unrealizedLossLiability;
        @SerializedName("stgyEq")
        @JsonProperty("stgyEq")
        private String strategyAmount;
        private String spotInUseAmt;
    }
}
