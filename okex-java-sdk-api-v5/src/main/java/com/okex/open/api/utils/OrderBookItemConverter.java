package com.okex.open.api.utils;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.okex.open.api.bean.other.SpotOrderBookItem;

public class OrderBookItemConverter extends StdConverter<String[], SpotOrderBookItem> {
    @Override
    public SpotOrderBookItem convert(String[] value) {
        return new SpotOrderBookItem(value[0], value[1], value[2], value[3]);
    }
}
