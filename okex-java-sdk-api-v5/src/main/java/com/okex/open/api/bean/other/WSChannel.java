package com.okex.open.api.bean.other;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.okex.open.api.bean.pub.InstrumentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WSChannel {
    private String channel;
    private String instId;
    private InstrumentType instType;
}
