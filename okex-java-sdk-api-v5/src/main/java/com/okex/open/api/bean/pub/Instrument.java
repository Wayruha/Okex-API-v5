package com.okex.open.api.bean.pub;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Instrument {
    private InstrumentType instType;
    private String instId;
    private String instFamily;
    @JsonProperty("uly")
    private String underlying;
    private String category;
    @JsonProperty("baseCcy")
    private String baseCurrency;
    @JsonProperty("quoteCcy")
    private String quoteCurrency;
    @JsonProperty("settleCcy")
    private String settleCurrency;
    @JsonProperty("ctVal")
    private String contractValue;
    @JsonProperty("ctMult")
    private String contractMultiplier;
    @JsonProperty("ctValCcy")
    private String contractValurCurrency;
    @JsonProperty("optType")
    private String optionType;
    @JsonProperty("stk")
    private String strikePrice;
    @JsonProperty("listTime")
    private String listingTime;
    @JsonProperty("expTime")
    private String expiryTime;
    private String lever;
    @JsonProperty("tickSz")
    private BigDecimal tickSize;
    @JsonProperty("lotSz")
    private BigDecimal lotSize;
    @JsonProperty("minSz")
    private BigDecimal minSize;
    @JsonProperty("ctType")
    private String contractType;
    private String alias;
    private String state;
    @JsonProperty("maxLmtSz")
    private BigDecimal maxLimitSize;
    @JsonProperty("maxMktSz")
    private BigDecimal maxMarketSize;
    @JsonProperty("maxTwapSz")
    private BigDecimal maxTwapSize;
    @JsonProperty("maxIcebergSz")
    private BigDecimal maxIcebergSize;
    @JsonProperty("maxTriggerSz")
    private BigDecimal maxTriggerSize;
    @JsonProperty("maxStopSz")
    private BigDecimal maxStopSize;
}
