package com.okex.open.api.bean.funding;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferResult {
    private String transId;
    @SerializedName("ccy")
    private String currency;
    private String clientId;
    private Direction from;
    @SerializedName("amt")
    private BigDecimal amount;
    private Direction to;
}
