package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawInfo {
    @SerializedName("addrEx")
    private String addressAttachment;
    @SerializedName("amt")
    private String amount;
    private String areaCodeFrom;
    private String areaCodeTo;
    @SerializedName("ccy")
    private String currency;
    private String chain;
    private String clientId;
    private String fee;
    private String feeCcy;
    private String from;
    private String memo;
    private String nonTradableAsset;
    @SerializedName("pTime")
    private String pushTime;
    @SerializedName("pmtId")
    private String paymentId;
    private WithdrawState state;
    private String subAcct;
    private String tag;
    private String to;
    @SerializedName("ts")
    private String timestamp;
    private String txId;
    private String uid;
    @SerializedName("wdId")
    private String withdrawalId;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public enum WithdrawState {
        @SerializedName("0")
        CANCELLING,
        @SerializedName("1")
        CANCELLED,
        @SerializedName("2")
        FAILED,
        @SerializedName("8")
        WAITING_WITHDRAWAL,
        @SerializedName("11")
        WITHDRAWING,
        @SerializedName("12")
        WITHDRAW_SUCCESS,
        @SerializedName("")
        APPROVED,
        @SerializedName("13")
        WAITING_TRANSFER,
        @SerializedName("4")
        @JsonAlias(value = {"5", "6", "8", "9", "12"})
        WAITING_MANUAL_REVIEW;
    }
}
