package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepositInfo {
    @SerializedName("actualDepBlkConfirm")
    private String actualDepBlockchainConfirm;
    @SerializedName("amt")
    private BigDecimal amount;
    private String areaCodeFrom;
    @SerializedName("ccy")
    private String currency;
    private String chain;
    private String depId;
    private String from;
    @SerializedName("fromWdId")
    private String fromWithdrawalId;
    @SerializedName("pTime")
    private String pushTime;
    private DepositState state;
    private String subAcct;
    private String to;
    @SerializedName("ts")
    private String timestamp;
    private String txId;
    private String uid;

    public enum DepositState {
        @SerializedName("0")
        WAITING_FOR_CONFIRMATION,
        @SerializedName("1")
        CREATED,
        @SerializedName("2")
        SUCCESSFUL,
        @SerializedName("8")
        PENDING,
        @SerializedName("11")
        ADDRESS_BLACKLIST_MATCHED,
        @SerializedName("12")
        ACC_OR_DEPOSIT_FROZEN,
        @SerializedName("13")
        SUBACC_DEPOSIT_INTERSECTION;
    }
}
