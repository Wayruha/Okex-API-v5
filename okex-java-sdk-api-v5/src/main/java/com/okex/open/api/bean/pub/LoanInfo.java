package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
public class LoanInfo {
    private List<Basic> basic;
    private List<Vip> vip;
    private List<Regular> regular;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Basic {
        @SerializedName("ccy")
        private String currency;
        private BigDecimal quota;
        private BigDecimal rate;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Vip {
        @SerializedName("irDiscount")
        private String interestRateDiscount;
        private String loanQuotaCoef;
        private String level;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Regular {
        @SerializedName("irDiscount")
        private String interestRateDiscount;
        private String loanQuotaCoef;
        private String level;
    }
}
