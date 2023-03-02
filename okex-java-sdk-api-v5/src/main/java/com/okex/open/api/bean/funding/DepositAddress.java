package com.okex.open.api.bean.funding;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepositAddress {
    @SerializedName("addr")
    private String address;
    private String tag;
    private String memo;
    @SerializedName("pmtId")
    private String paymentId;
    private String addrEx;
    @SerializedName("ccy")
    private String currency;
    private String chain;
    private String to;
    private Boolean selected;
    @SerializedName("ctAddr")
    private String contractAddress;
}
