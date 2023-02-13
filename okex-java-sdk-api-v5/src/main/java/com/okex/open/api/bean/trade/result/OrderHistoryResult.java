package com.okex.open.api.bean.trade.result;

import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.pub.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderHistoryResult {
    private InstrumentType instType;
    private String instId;
    @SerializedName("ccy")
    private String currency;
    private String ordId;
    private String clOrdId;
    private String tag;
    @SerializedName("px")
    private String price;
    @SerializedName("sz")
    private String size;
    private OrderType ordType;
    private OrderSide side;
    private String posSide;
    private TradeMode tdMode;
    private String accFillSz;
    private String fillPx;
    private String tradeId;
    private String fillSz;
    private String fillTime;
    private OrderState state;
    private String avgPx;
    private String lever;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String tpOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String slOrdPx;
    private String feeCcy;
    private String fee;
    private String rebateCcy;
    private String source;
    private String rebate;
    private String tgtCcy;
    private String pnl;
    private String category;
    private boolean reduceOnly;
    private long uTime;
    private long cTime;
}
