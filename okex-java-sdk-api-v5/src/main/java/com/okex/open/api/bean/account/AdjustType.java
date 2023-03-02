package com.okex.open.api.bean.account;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum AdjustType {
    @SerializedName("add")
    ADD("add"),
    @SerializedName("reduce")
    REDUCE("reduce"),

    SPOT_DERIVATIVES_USDT("1"),
    SPOT_DERIVATIVES_CRYPTO("2"),
    DERIVATIVES_ONLY("3");

    @Getter
    private String code;

    AdjustType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
