package com.okex.open.api.bean.pub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanInfo {
    private List<Basic> basic;
    private List<Vip> vip;
    private List<Regular> regular;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Basic {
        @JsonProperty("ccy")
        private String currency;
        private BigDecimal quota;
        private BigDecimal rate;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Vip {
        @JsonProperty("irDiscount")
        private String interestRateDiscount;
        private String loanQuotaCoef;
        private String level;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Regular {
        @JsonProperty("irDiscount")
        private String interestRateDiscount;
        private String loanQuotaCoef;
        private String level;
    }
}
