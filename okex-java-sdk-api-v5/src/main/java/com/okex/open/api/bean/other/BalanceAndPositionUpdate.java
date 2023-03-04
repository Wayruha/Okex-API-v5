package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceAndPositionUpdate {
    private String pTime;
    private String eventType;
    private List<BalanceData> balData;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BalanceData {
        @SerializedName("ccy")
        private String ccy;
        private BigDecimal cashBal;
        @SerializedName("uTime")
        private Long updateTime;
    }
}
