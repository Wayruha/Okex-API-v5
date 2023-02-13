package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum OrderSide {
    @SerializedName("buy")
    BUY("buy"),
    @SerializedName("sell")
    SELL("sell");

    @Getter
    private String code;

    OrderSide(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
