package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum TradeMode {
    @SerializedName("cross")
    CROSS("cross"),
    @SerializedName("isolated")
    ISOLATED("isolated"),
    @SerializedName("cash")
    CASH("cash");

    @Getter
    private String code;

    TradeMode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
