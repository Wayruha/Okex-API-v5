package com.okex.open.api.bean.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WSChannel {
    private String channel;
    private String instId;
}
