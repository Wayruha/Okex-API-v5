package com.okex.open.api.bean.pub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Instrument {
    private InstrumentType instType;
    private String instId;
    private String instFamily;
    private String uly;
    private String category;
    private String baseCcy;
    private String quoteCcy;
    private String settleCcy;
    private String ctVal;
    private String ctMult;
    private String ctValCcy;
    private String optType;
    private String stk;
    private String listTime;
    private String expTime;
    private String lever;
    private String tickSz;
    private String lotSz;
    private String minSz;
    private String ctType;
    private String alias;
    private String state;
    private String maxLmtSz;
    private String maxMktSz;
    private String maxTwapSz;
    private String maxIcebergSz;
    private String maxTriggerSz;
    private String maxStopSz;
}
