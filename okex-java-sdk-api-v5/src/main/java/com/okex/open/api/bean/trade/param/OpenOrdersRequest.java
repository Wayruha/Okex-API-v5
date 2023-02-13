package com.okex.open.api.bean.trade.param;

import com.okex.open.api.bean.pub.InstrumentType;
import com.okex.open.api.bean.pub.OrderState;
import com.okex.open.api.bean.pub.OrderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OpenOrdersRequest {
    private InstrumentType instType;
    private String uli;
    private String instFamily;
    private String instId;
    private OrderType ordType;
    private OrderState state;
    private String after;
    private String before;
    private String limit;
}
