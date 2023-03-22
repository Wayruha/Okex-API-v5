package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepositInfo {
    @JsonProperty("actualDepBlkConfirm")
    private String actualDepBlockchainConfirm;
    @JsonProperty("amt")
    private String amount;
    private String areaCodeFrom;
    @JsonProperty("ccy")
    private String currency;
    private String chain;
    private String depId;
    private String from;
    @JsonProperty("fromWdId")
    private String fromWithdrawalId;
    @JsonProperty("pTime")
    private String pushTime;
    private DepositState state;
    private String subAcct;
    private String to;
    @JsonProperty("ts")
    private String timestamp;
    private String txId;
    private String uid;

    public enum DepositState {
        @JsonProperty("0")
        WAITING_FOR_CONFIRMATION,
        @JsonProperty("1")
        CREATED,
        @JsonProperty("2")
        SUCCESSFUL,
        @JsonProperty("8")
        PENDING,
        @JsonProperty("11")
        ADDRESS_BLACKLIST_MATCHED,
        @JsonProperty("12")
        ACC_OR_DEPOSIT_FROZEN,
        @JsonProperty("13")
        SUBACC_DEPOSIT_INTERSECTION;
    }
}
