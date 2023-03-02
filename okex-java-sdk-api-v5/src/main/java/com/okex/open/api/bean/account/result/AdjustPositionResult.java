package com.okex.open.api.bean.account.result;

import com.okex.open.api.bean.account.AdjustType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdjustPositionResult {
    private String amt;
    private String ccy;
    private String instId;
    private String leverage;
    private String posSide;
    private AdjustType type;
}
