package com.okex.open.api.bean.funding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    private Boolean canDep;
    private Boolean canInternal;
    private Boolean canWd;
    private String ccy;
    private String chain;
    private String depQuotaFixed;
    private String depQuoteDailyLayer2;
    private String logoLink;
    private Boolean mainNet;
    private String maxFee;
    private String maxWd;
    private String minDep;
    private String minDepArrivalConfirm;
    private String minFee;
    private String minWd;
    private String minWdUnlockConfirm;
    private String name;
    private Boolean needTag;
    private String usedDepQuotaFixed;
    private String usedWdQuota;
    private String wdQuota;
    private String wdTickSz;
}
