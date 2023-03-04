package com.okex.open.api.bean.other;

import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.pub.InstrumentType;
import com.okex.open.api.bean.pub.MarginMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionUpdate {
    private String pTime;
    private String eventType;
    private List<BalanceData> balData;
    private List<PositionData> posData;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class BalanceData {
        @SerializedName("ccy")
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
        @SerializedName("pos")
        private String positionQty;
        @SerializedName("ccy")
        private String ccy;
        private String posCcy;
        @SerializedName("avgPx")
        private String avgOpenPrice;
        private String uTIme;
    }
}
