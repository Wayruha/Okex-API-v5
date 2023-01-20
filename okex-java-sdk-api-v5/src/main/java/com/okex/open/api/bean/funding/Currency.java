package com.okex.open.api.bean.funding;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    @SerializedName("canDep")
    private Boolean canDeposit;
    private Boolean canInternal;
    @SerializedName("canWd")
    private Boolean canWithdraw;
    @SerializedName("ccy")
    private String currency;
    private String chain;
    @SerializedName("depQuotaFixed")
    private String depositQuotaFixed;
    @SerializedName("depQuoteDailyLayer2")
    private String depositQuoteDailyLayer2;
    private String logoLink;
    private Boolean mainNet;
    private BigDecimal maxFee;
    private BigDecimal maxWd;
    private BigDecimal minDep;
    private String minDepArrivalConfirm;
    private BigDecimal minFee;
    @SerializedName("minWd")
    private BigDecimal minWithdraw;
    @SerializedName("minWdUnlockConfirm")
    private String minWithdrawUnlockConfirm;
    private String name;
    private Boolean needTag;
    @SerializedName("usedDepQuotaFixed")
    private String usedDepositQuotaFixed;
    @SerializedName("usedWdQuota")
    private String usedWithdrawQuota;
    @SerializedName("wdQuota")
    private BigDecimal withdrawQuota;
    @SerializedName("wdTickSz")
    private BigDecimal withdrawTickSize;
}
