package com.okex.open.api.bean.account;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum PositionSide {
    @SerializedName("long")
    LONG("long"),
    @SerializedName("short")
    SHORT("short"),
    @SerializedName("net")
    NET("net");
    @Getter
    private String code;

    PositionSide(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
