package com.okex.open.api.bean.account.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TradeFeeData {
  @SerializedName("level")
  private String level;
  @SerializedName("maker")
  private String makerRate;
  @SerializedName("taker")
  private String takerRate;
  @SerializedName("takerUSDC")
  private String takerRateUSDC;
  @SerializedName("makerUSDC")
  private String makerRateUSDC;
  @SerializedName("takerU")
  private String futuresTakerRate;
  @SerializedName("makerU")
  private String futuresMakerRate;
  private String delivery;
  private String exercise;
  @SerializedName("instType")
  private String instrumentType;
  @SerializedName("ts")
  private long timestamp;
}
