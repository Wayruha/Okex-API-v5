package com.okex.open.api.bean.account.result;

import com.okex.open.api.bean.pub.InstrumentType;
import com.okex.open.api.bean.pub.MarginMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    private String instId;
    private String ccy;
    private InstrumentType instType;
    private MarginMode mgnMode;
    private String baseBal;
    private String quoteBal;
    private String baseBorrowed;
    private String baseInterest;
    private String quoteBorrowed;
    private String quoteInterest;
}
