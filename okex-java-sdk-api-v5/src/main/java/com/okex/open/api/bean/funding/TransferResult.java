package com.okex.open.api.bean.funding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferResult {
    private String transId;
    private String ccy;
    private String clientId;
    private Direction from;
    private BigDecimal amt;
    private Direction to;
}
