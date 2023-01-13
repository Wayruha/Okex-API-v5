package com.okex.open.api.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OkexResponse<T> {
    private String code;
    private String msg;
    private T data;
}
