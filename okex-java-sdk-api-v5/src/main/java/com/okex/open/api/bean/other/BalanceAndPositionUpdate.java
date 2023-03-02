package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
        private String ccy;
        private BigDecimal cashBal;
        private Long uTime;
    }
}
