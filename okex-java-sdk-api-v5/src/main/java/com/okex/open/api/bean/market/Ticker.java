package com.okex.open.api.bean.market;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("last")
    private BigDecimal lastTradedPrice;
    @JsonProperty("lastSz")
    private BigDecimal lastTradedSize;
    @JsonProperty("askPx")
    private BigDecimal bestAskPrice;
    @JsonProperty("askSz")
    private BigDecimal bestAskSize;
    @JsonProperty("bidPx")
    private BigDecimal bestBidPrice;
    @JsonProperty("bidSz")
    private BigDecimal bestBidSize;
    @JsonProperty("open24h")
    private BigDecimal openPrise24h;
    @JsonProperty("high24h")
    private BigDecimal highestPrice24h;
    @JsonProperty("low24h")
    private BigDecimal lowestPrice24h;
    @JsonProperty("volCcy24h")
    private BigDecimal tradingVolumeCcy24h;
    @JsonProperty("vol24h")
    private BigDecimal tradingVolume24h;
    @JsonProperty("sodUtc0")
    private BigDecimal openPriceUtc0;
    @JsonProperty("sodUtc8")
    private BigDecimal openPriceUtc8;
    @JsonProperty("ts")
    private long timestamp;
}
