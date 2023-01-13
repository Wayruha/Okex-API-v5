package com.okex.open.api.bean.other;

import com.okex.open.api.bean.other.WSChannel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WSResponse<T> {
    private WSChannel arg;
    private String action;
    private T data;
}
