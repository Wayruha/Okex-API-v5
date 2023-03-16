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
    @SerializedName("clOrdId")
    private String clientOrderId;
    private String tag;
    @SerializedName("px")
    private String price;
    @SerializedName("sz")
    private String size;
    private OrderType ordType;
    private OrderSide side;
    private String posSide;
    @SerializedName("tdMode")
    private TradeMode tradeMode;
    @SerializedName("accFillSz")
    private String actualFillSize;
    @SerializedName("fillPx")
    private String lastFilledPrice;
    private String tradeId;
    @SerializedName("fillSz")
    private String fillSize;
    private String fillTime;
    private OrderState state;
    @SerializedName("avgPx")
    private String averageFillPrice;
    @SerializedName("lever")
    private String leverage;
    @SerializedName("tpTriggerPx")
    private String tpTriggerPrice;
    @SerializedName("tpTriggerPxType")
    private String tpTriggerPriceType;
    @SerializedName("tpOrdPx")
    private String tpOrderPrice;
    @SerializedName("slTriggerPx")
    private String slTriggerPrice;
    @SerializedName("slTriggerPxType")
    private String slTriggerPriceType;
    @SerializedName("slOrdPx")
    private String slOrderPrice;
    @SerializedName("feeCcy")
    private String feeCurrency;
    private String fee;
    private String rebateCcy;
    private String source;
    private String rebate;
    @SerializedName("tgtCcy")
    private String targetCurrency;
    private String pnl;
    private String category;
    private boolean reduceOnly;
    private long uTime;
    private long cTime;
}
