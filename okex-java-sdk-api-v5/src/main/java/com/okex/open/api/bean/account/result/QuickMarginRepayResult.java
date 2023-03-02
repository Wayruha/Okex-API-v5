package com.okex.open.api.bean.account.result;

import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.account.param.QuickMarginBorrowRepay;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuickMarginRepayResult {
    private String instId;
    @SerializedName("ccy")
    private String currency;
    private QuickMarginBorrowRepay.Side side;
    @SerializedName("amt")
    private BigDecimal amount;
}
