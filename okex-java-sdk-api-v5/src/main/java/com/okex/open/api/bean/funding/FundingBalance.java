package com.okex.open.api.bean.funding;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundingBalance {
    @SerializedName("availBal")
    private BigDecimal availBalance;
    @SerializedName("bal")
    private BigDecimal balance;
    @SerializedName("ccy")
    private String currency;
    @SerializedName("frozenBal")
    private BigDecimal frozenBalance;
}
