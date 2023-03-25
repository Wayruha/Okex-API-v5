package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawInfo {
    @JsonProperty("addrEx")
    private String addressAttachment;
    @JsonProperty("amt")
    private String amount;
    private String areaCodeFrom;
    private String areaCodeTo;
    @JsonProperty("ccy")
    private String currency;
    private String chain;
    private String clientId;
    private String fee;
    private String feeCcy;
    private String from;
    private String memo;
    private String nonTradableAsset;
    @JsonProperty("pTime")
    private String pushTime;
    @JsonProperty("pmtId")
    private String paymentId;
    private WithdrawState state;
    private String subAcct;
    private String tag;
    private String to;
    @JsonProperty("ts")
    private String timestamp;
    private String txId;
    private String uid;
    @JsonProperty("wdId")
    private String withdrawalId;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public enum WithdrawState {
        @JsonProperty("0")
        CANCELLING,
        @JsonProperty("1")
        CANCELLED,
        @JsonProperty("2")
        FAILED,
        @JsonProperty("8")
        WAITING_WITHDRAWAL,
        @JsonProperty("11")
        WITHDRAWING,
        @JsonProperty("12")
        WITHDRAW_SUCCESS,
        @JsonProperty("")
        APPROVED,
        @JsonProperty("13")
        WAITING_TRANSFER,
        @JsonProperty("4")
        @JsonAlias(value = {"5", "6", "8", "9", "12"})
        WAITING_MANUAL_REVIEW;
    }
}
