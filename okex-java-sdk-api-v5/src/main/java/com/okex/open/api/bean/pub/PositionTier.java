package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionTier {
    private String baseMaxLoan;
    @SerializedName("imr")
    private String initialMarginRequirementRate;
    private String instId;
    private String maxLever;
    @SerializedName("maxSz")
    private BigDecimal maxSize;
    @SerializedName("minSz")
    private BigDecimal minSize;
    @SerializedName("mmr")
    private String maintenanceMarginRequirementRate;
    @SerializedName("optMgnFactor")
    private String optionMarginCoefficient;
    private String quoteMaxLoan;
    private String tier;
    @SerializedName("uly")
    private String underlying;
    private String instFamily;
}
