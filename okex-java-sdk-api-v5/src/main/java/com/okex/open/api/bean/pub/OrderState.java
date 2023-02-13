package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum OrderState {
    @SerializedName("live")
    LIVE("live"),
    @SerializedName("partially_filled")
    PARTIALLY_FILLED("partially_filled"),
    @SerializedName("filled")
    FILLED("filled"),
    @SerializedName("cancelled")
    CANCELLED("cancelled");

    @Getter
    private String code;

    OrderState(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
