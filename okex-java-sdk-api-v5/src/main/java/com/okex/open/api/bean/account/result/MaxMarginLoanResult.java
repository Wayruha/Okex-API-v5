package com.okex.open.api.bean.account.result;

import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.pub.MarginMode;
import com.okex.open.api.bean.pub.OrderSide;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaxMarginLoanResult {
    private String instId;
    @SerializedName("mgnMode")
    private MarginMode marginMode;
    @SerializedName("mgnCcy")
    private String marginCurrency;
    private BigDecimal maxLoan;
    @SerializedName("ccy")
    private String currency;
    private OrderSide side;
}
