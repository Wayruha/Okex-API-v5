package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum OrderType {
    @SerializedName("market")
    MARKET("market"),
    @SerializedName("limit")
    LIMIT("limit"),
    @SerializedName("post_only")
    POST_ONLY("post_only"),
    @SerializedName("fok")
    FILL_OR_KILL("fok"),
    @SerializedName("ioc")
    IMMEDIATE_OR_CANCEL("ioc"),
    @SerializedName("optimal_limit_ioc")
    OPTIMAL_LIMIT_IOC("optimal_limit_ioc");

    @Getter
    private String code;

    OrderType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
