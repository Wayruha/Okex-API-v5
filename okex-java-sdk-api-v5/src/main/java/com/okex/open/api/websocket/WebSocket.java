package com.okex.open.api.websocket;

import com.okex.open.api.bean.other.WSChannel;

public interface WebSocket {

    void connect();

    void close();

    void login(String apiKey, String apiSecret, String passphrase);

    void subscribe(WSChannel... args);

    void unSubscribe(WSChannel... args);

    void sendPing();

    boolean checkSum(String data);
}
