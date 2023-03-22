package com.okex.open.api.bean.account.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.pub.InstrumentType;
import com.okex.open.api.bean.pub.MarginMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    private String instId;
    @SerializedName("ccy")
    @JsonProperty("ccy")
    private String currency;
    private InstrumentType instType;
    private MarginMode mgnMode;
    private String baseBal;
    private String quoteBal;
    private String baseBorrowed;
    private String baseInterest;
    private String quoteBorrowed;
    private String quoteInterest;
}
