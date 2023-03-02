package com.okex.open.api.bean.account.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountBalance {
    private String adjEq;
    private String imr;
    private String isoEq;
    private String mgnRatio;
    private String mmr;
    private String notionalUsd;
    private String ordFroz;
    private String totalEq;
    private String uTime;
    private List<Details> details;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Details {
        private String availBal;
        private String availEq;
        private String cashBal;
        private String ccy;
        private String crossLiab;
        private String disEq;
        private String eq;
        private String eqUsd;
        private String frozenBal;
        private String interest;
        private String isoEq;
        private String isoLiab;
        private String isoUpl;
        private String liab;
        private String maxLoan;
        private String mgnRatio;
        private String notionalLever;
        private String ordFrozen;
        private String twap;
        private String uTime;
        private String upl;
        private String uplLiab;
        private String stgyEq;
        private String spotInUseAmt;
    }
}
