package com.okex.open.api.bean.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @SerializedName("clOrdId")
    private String clientOrderId;
    @SerializedName("ordId")
    private String orderId;
    private String tag;
    @SerializedName("sCode")
    private String ode;
    @SerializedName("sMsg")
    private String msg;
}
