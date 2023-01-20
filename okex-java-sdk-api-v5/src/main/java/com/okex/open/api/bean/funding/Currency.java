package com.okex.open.api.bean.funding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    @JsonProperty("canDep")
    private Boolean canDeposit;
    private Boolean canInternal;
    @JsonProperty("canWd")
    private Boolean canWithdraw;
    @JsonProperty("ccy")
    private String currency;
    private String chain;
    @JsonProperty("depQuotaFixed")
    private String depositQuotaFixed;
    @JsonProperty("depQuoteDailyLayer2")
    private String depositQuoteDailyLayer2;
    private String logoLink;
    private Boolean mainNet;
    private BigDecimal maxFee;
    private BigDecimal maxWd;
    private BigDecimal minDep;
    private String minDepArrivalConfirm;
    private BigDecimal minFee;
    @JsonProperty("minWd")
    private BigDecimal minWithdraw;
    @JsonProperty("minWdUnlockConfirm")
    private String minWithdrawUnlockConfirm;
    private String name;
    private Boolean needTag;
    @JsonProperty("usedDepQuotaFixed")
    private String usedDepositQuotaFixed;
    @JsonProperty("usedWdQuota")
    private String usedWithdrawQuota;
    @JsonProperty("wdQuota")
    private BigDecimal withdrawQuota;
    @JsonProperty("wdTickSz")
    private BigDecimal withdrawTickSize;
}
