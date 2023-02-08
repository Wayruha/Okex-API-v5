package com.okex.open.api.bean.trade.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OneClickRepayResult {
    private String debtCcy;
    private BigDecimal fillDebtSz;
    private BigDecimal fillRepaySz;
    private String repayCcy;
    private String status;
    private long uTime;
}
