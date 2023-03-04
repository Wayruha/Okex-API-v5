package com.okex.open.api.bean.trade.param;

import com.google.gson.annotations.SerializedName;
import com.okex.open.api.bean.pub.OrderSide;
import com.okex.open.api.bean.pub.OrderType;
import com.okex.open.api.bean.pub.TradeMode;

public class PlaceOrder {
    private String instId;
    @SerializedName("tdMode")
    private TradeMode tradeMode;
    @SerializedName("ccy")
    private String currency;
    @SerializedName("clOrdId")
    private String clientOrderId;
    private String tag;
    private OrderSide side;
    private String posSide;
    private OrderType ordType;
    @SerializedName("sz")
    private String size;
    @SerializedName("px")
    private String price;
    @SerializedName("tgtCcy")
    private String currencyTypeUsed;

    public String getQuickMgnType() {
        return quickMgnType;
    }

    public void setQuickMgnType(String quickMgnType) {
        this.quickMgnType = quickMgnType;
    }

    private String quickMgnType;

    public String getTpTriggerPx() {
        return tpTriggerPx;
    }

    public void setTpTriggerPx(String tpTriggerPx) {
        this.tpTriggerPx = tpTriggerPx;
    }

    public String getTpOrdPx() {
        return tpOrdPx;
    }

    public void setTpOrdPx(String tpOrdPx) {
        this.tpOrdPx = tpOrdPx;
    }

    public String getSlTriggerPx() {
        return slTriggerPx;
    }

    public void setSlTriggerPx(String slTriggerPx) {
        this.slTriggerPx = slTriggerPx;
    }

    public String getSlOrdPx() {
        return slOrdPx;
    }

    public void setSlOrdPx(String slOrdPx) {
        this.slOrdPx = slOrdPx;
    }

    public String getTpTriggerPxType() {
        return tpTriggerPxType;
    }

    public void setTpTriggerPxType(String tpTriggerPxType) {
        this.tpTriggerPxType = tpTriggerPxType;
    }

    public String getSlTriggerPxType() {
        return slTriggerPxType;
    }

    public void setSlTriggerPxType(String slTriggerPxType) {
        this.slTriggerPxType = slTriggerPxType;
    }

    private String tpTriggerPx;
    private String tpOrdPx;
    private String slTriggerPx;
    private String slOrdPx;
    private String tpTriggerPxType;
    private String slTriggerPxType;

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "instId='" + instId + '\'' +
                ", tdMode='" + tradeMode + '\'' +
                ", ccy='" + currency + '\'' +
                ", clOrdId='" + clientOrderId + '\'' +
                ", tag='" + tag + '\'' +
                ", side='" + side + '\'' +
                ", posSide='" + posSide + '\'' +
                ", ordType='" + ordType + '\'' +
                ", sz='" + size + '\'' +
                ", px='" + price + '\'' +
                ", tgtCcy='" + currencyTypeUsed + '\'' +
                ", banAmend=" + banAmend +
                ", reduceOnly=" + reduceOnly +
                ", tpTriggerPx='" + tpTriggerPx + '\'' +
                ", tpOrdPx='" + tpOrdPx + '\'' +
                ", slTriggerPx='" + slTriggerPx + '\'' +
                ", slOrdPx='" + slOrdPx + '\'' +
                ", tpTriggerPxType=" + tpTriggerPxType +
                ", slTriggerPxType=" + slTriggerPxType +
                ", quickMgnType=" + quickMgnType +
                '}';
    }

    public Boolean getBanAmend() {
        return banAmend;
    }

    public void setBanAmend(Boolean banAmend) {
        this.banAmend = banAmend;
    }

    private Boolean banAmend;



    public String getCurrencyTypeUsed() {
        return currencyTypeUsed;
    }

    public void setCurrencyTypeUsed(String currencyTypeUsed) {
        this.currencyTypeUsed = currencyTypeUsed;
    }

    public Boolean getReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    private Boolean reduceOnly;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public TradeMode getTdMode() {
        return tradeMode;
    }

    public void setTdMode(TradeMode tdMode) {
        this.tradeMode = tdMode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public String getPosSide() {
        return posSide;
    }

    public void setPosSide(String posSide) {
        this.posSide = posSide;
    }

    public OrderType getOrdType() {
        return ordType;
    }

    public void setOrdType(OrderType ordType) {
        this.ordType = ordType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



}
