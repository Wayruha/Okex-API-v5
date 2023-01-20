package com.okex.open.api.bean.pub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionTier {
    private String baseMaxLoan;
    @JsonProperty("imr")
    private String initialMarginRequirementRate;
    private String instId;
    private String maxLever;
    @JsonProperty("maxSz")
    private BigDecimal maxSize;
    @JsonProperty("minSz")
    private BigDecimal minSize;
    @JsonProperty("mmr")
    private String maintenanceMarginRequirementRate;
    @JsonProperty("optMgnFactor")
    private String optionMarginCoefficient;
    private String quoteMaxLoan;
    private String tier;
    @JsonProperty("uly")
    private String underlying;
    private String instFamily;
}
