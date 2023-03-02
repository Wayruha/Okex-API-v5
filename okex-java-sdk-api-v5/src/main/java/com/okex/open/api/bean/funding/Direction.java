package com.okex.open.api.bean.funding;

import com.google.gson.annotations.SerializedName;

public enum Direction {
    @SerializedName("6")
    FUNDING_ACC("6"),
    @SerializedName("18")
    TRADING_ACC("18");

    private String code;

    Direction(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
