package com.okex.open.api.bean.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticker {
    private String instType;
    private String instId;
    @SerializedName("last")
    private BigDecimal lastTradedPrice;
    @SerializedName("lastSz")
    private BigDecimal lastTradedSize;
    @SerializedName("askPx")
    private BigDecimal bestAskPrice;
    @SerializedName("askSz")
    private BigDecimal bestAskSize;
    @SerializedName("bidPx")
    private BigDecimal bestBidPrice;
    @SerializedName("bidSz")
    private BigDecimal bestBidSize;
    @SerializedName("open24h")
    private BigDecimal openPrise24h;
    @SerializedName("high24h")
    private BigDecimal highestPrice24h;
    @SerializedName("low24h")
    private BigDecimal lowestPrice24h;
    @SerializedName("volCcy24h")
    private BigDecimal tradingVolumeCcy24h;
    @SerializedName("vol24h")
    private BigDecimal tradingVolume24h;
    @SerializedName("sodUtc0")
    private BigDecimal openPriceUtc0;
    @SerializedName("sodUtc8")
    private BigDecimal openPriceUtc8;
    @SerializedName("ts")
    private long timestamp;
}
