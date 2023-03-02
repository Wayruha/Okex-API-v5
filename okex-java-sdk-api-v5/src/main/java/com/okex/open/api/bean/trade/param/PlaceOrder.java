package com.okex.open.api.bean.trade.param;

import com.okex.open.api.bean.pub.OrderSide;
import com.okex.open.api.bean.pub.OrderType;
import com.okex.open.api.bean.pub.TradeMode;

public class PlaceOrder {
    private String instId;
    private TradeMode tdMode;
    private String ccy;
    private String clOrdId;
    private String tag;
    private OrderSide side;
    private String posSide;
    private OrderType ordType;
    private String sz;
    private String px;
    private String tgtCcy;

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
                ", tdMode='" + tdMode + '\'' +
                ", ccy='" + ccy + '\'' +
                ", clOrdId='" + clOrdId + '\'' +
                ", tag='" + tag + '\'' +
                ", side='" + side + '\'' +
                ", posSide='" + posSide + '\'' +
                ", ordType='" + ordType + '\'' +
                ", sz='" + sz + '\'' +
                ", px='" + px + '\'' +
                ", tgtCcy='" + tgtCcy + '\'' +
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



    public String getTgtCcy() {
        return tgtCcy;
    }

    public void setTgtCcy(String tgtCcy) {
        this.tgtCcy = tgtCcy;
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
        return tdMode;
    }

    public void setTdMode(TradeMode tdMode) {
        this.tdMode = tdMode;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getClOrdId() {
        return clOrdId;
    }

    public void setClOrdId(String clOrdId) {
        this.clOrdId = clOrdId;
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

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }



}
