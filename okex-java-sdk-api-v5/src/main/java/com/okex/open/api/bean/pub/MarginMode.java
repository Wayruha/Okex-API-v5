package com.okex.open.api.bean.pub;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum MarginMode {
    @SerializedName("cross")
    @JsonProperty("cross")
    CROSS("cross"),
    @SerializedName("isolated")
    @JsonProperty("isolated")
    ISOLATED("isolated");

    @Getter
    private String code;

    MarginMode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
