package com.okex.open.api.bean.pub;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public enum QuickMarginType {
    @SerializedName("manual")
    MANUAL("manual"),
    @SerializedName("auto_borrow")
    AUTO_BORROW("auto_borrow"),
    @SerializedName("auto_repay")
    AUTO_REPAY("auto_repay");

    @Getter
    private final String name;

    QuickMarginType(String name) {
        this.name = name;
    }
}
