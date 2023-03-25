package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.okex.open.api.bean.pub.InstrumentType;
import com.okex.open.api.bean.pub.MarginMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionUpdate {
    private String pTime;
    private String eventType;
    private List<BalanceData> balData;
    private List<PositionData> posData;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class BalanceData {
        @JsonProperty("ccy")
        private String ccy;
        private String cashBal;
        private String uTime;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class PositionData {
        private String posId;
        private String tradeId;
        private String instId;
        private InstrumentType instType;
        private MarginMode mgnMode;
        private String posSide;
        @JsonProperty("pos")
        private String positionQty;
        @JsonProperty("ccy")
        private String ccy;
        private String posCcy;
        @JsonProperty("avgPx")
        private String avgOpenPrice;
        private String uTIme;
    }
}
