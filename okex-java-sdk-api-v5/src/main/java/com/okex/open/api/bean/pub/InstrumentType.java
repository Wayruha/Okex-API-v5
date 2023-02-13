package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum InstrumentType {
    @SerializedName("spot")
    SPOT("spot"),
    @SerializedName("margin")
    MARGIN("margin"),
    @SerializedName("swap")
    SWAP("swap"),
    @SerializedName("futures")
    FUTURS("futures"),
    @SerializedName("option")
    OPTION("option");

    @Getter
    private String code;

    InstrumentType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
