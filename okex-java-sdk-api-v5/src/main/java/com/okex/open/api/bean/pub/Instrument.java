package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instrument {
    private InstrumentType instType;
    private String instId;
    private String instFamily;
    @SerializedName("uly")
    private String underlying;
    private String category;
    @SerializedName("baseCcy")
    private String baseCurrency;
    @SerializedName("quoteCcy")
    private String quoteCurrency;
    @SerializedName("settleCcy")
    private String settleCurrency;
    @SerializedName("ctVal")
    private String contractValue;
    @SerializedName("ctMult")
    private String contractMultiplier;
    @SerializedName("ctValCcy")
    private String contractValurCurrency;
    @SerializedName("optType")
    private String optionType;
    @SerializedName("stk")
    private String strikePrice;
    @SerializedName("listTime")
    private String listingTime;
    @SerializedName("expTime")
    private String expiryTime;
    private String lever;
    @SerializedName("tickSz")
    private BigDecimal tickSize;
    @SerializedName("lotSz")
    private BigDecimal lotSize;
    @SerializedName("minSz")
    private BigDecimal minSize;
    @SerializedName("ctType")
    private String contractType;
    private String alias;
    private String state;
    @SerializedName("maxLmtSz")
    private BigDecimal maxLimitSize;
    @SerializedName("maxMktSz")
    private BigDecimal maxMarketSize;
    @SerializedName("maxTwapSz")
    private BigDecimal maxTwapSize;
    @SerializedName("maxIcebergSz")
    private BigDecimal maxIcebergSize;
    @SerializedName("maxTriggerSz")
    private BigDecimal maxTriggerSize;
    @SerializedName("maxStopSz")
    private BigDecimal maxStopSize;
}
