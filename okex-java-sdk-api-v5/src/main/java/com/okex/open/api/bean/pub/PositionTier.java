package com.okex.open.api.bean.pub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionTier {
    private String baseMaxLoan;
    private String imr;
    private String instId;
    private String maxLever;
    private String maxSz;
    private String minSz;
    private String mmr;
    private String optMgnFactor;
    private String quoteMaxLoan;
    private String tier;
    private String uly;
    private String instFamily;
}
