package com.okex.open.api.bean.funding;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawResult {
    @SerializedName("amt")
    private String amount;
    @SerializedName("wdId")
    private String withdrawalId;
    @SerializedName("ccy")
    private String currency;
    private String clientId;
    private String chain;
}
