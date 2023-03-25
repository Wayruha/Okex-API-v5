package com.okex.open.api.websocket;

import lombok.Getter;

@Getter
public enum WebSocketAccess {
    PUBLIC("wss://ws.okx.com:8443/ws/v5/public"),
    PRIVATE("wss://ws.okx.com:8443/ws/v5/private"),
    BUSINESS("wss://ws.okx.com:8443/ws/v5/business");
    private String url;

    WebSocketAccess(String url) {
        this.url = url;
    }
}
