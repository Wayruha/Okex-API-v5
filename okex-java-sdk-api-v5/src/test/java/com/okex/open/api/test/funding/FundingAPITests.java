package com.okex.open.api.test.funding;

import com.alibaba.fastjson.JSONObject;
import com.okex.open.api.bean.funding.*;
import com.okex.open.api.bean.funding.param.*;
import com.okex.open.api.bean.other.DepositInfo;
import com.okex.open.api.service.OkexResponse;
import com.okex.open.api.service.funding.FundingAPIService;
import com.okex.open.api.service.funding.impl.FundingAPIServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class FundingAPITests extends FundingAPIBaseTests {

    private static final Logger LOG = LoggerFactory.getLogger(FundingAPITests.class);

    private FundingAPIService fundingAPIService;


    @Before
    public void before() {
        config = config();
        fundingAPIService = new FundingAPIServiceImpl(config);
    }


    /**
     * 获取币种列表 Get Currencies
     * GET /api/v5/asset/currencies
     */
    @Test
    public void getCurrencies() {
        OkexResponse<List<Currency>> result = fundingAPIService.getCurrencies();
        toResultString(LOG, "result", result);
    }

    /**
     * 获取资金账户余额 Get Balance
     * GET /api/v5/asset/balances
     */
    @Test
    public void getBalance() {
        OkexResponse<List<FundingBalance>> result = fundingAPIService.getBalance("USDT");
        toResultString(LOG, "result", result);
    }

    /**
     * 获取账户资产估值 Get account asset valuation
     * GET /api/v5/asset/asset-valuation
     */
    @Test
    public void assetValuation(){
        JSONObject result = fundingAPIService.assetValuation(null);
        toResultString(LOG,"result",result);
    }


    /**
     * 资金划转 Funds Transfer
     * POST /api/v5/asset/transfer
     */
    @Test
    public void fundsTransfer() {
        FundsTransfer fundsTransfer = new FundsTransfer();
        fundsTransfer.setCurrency("USDT");
        fundsTransfer.setAmount("1");
//        fundsTransfer.setType("0");
        fundsTransfer.setFrom(Direction.TRADING_ACC);
        fundsTransfer.setTo(Direction.FUNDING_ACC);
//        fundsTransfer.setSubAcct("");
        fundsTransfer.setClientId("");
        fundsTransfer.setLoanTrans(false);
        fundsTransfer.setOmitPosRisk("false");
        OkexResponse<List<TransferResult>> result = fundingAPIService.fundsTransfer(fundsTransfer);
        toResultString(LOG, "result", result);
    }

    /**
     * 获取资金划转状态
     * GET /api/v5/asset/transfer-state
     */
    @Test
    public void transferState() {
        JSONObject result = fundingAPIService.transferState("1234",null,"0");
        toResultString(LOG, "result", result);
    }

    /**
     * 资金流水查询 Asset Bills Details
     * GET /api/v5/asset/bills
     */
    @Test
    public void assetBillsDetails() {
        JSONObject result = fundingAPIService.assetBillsDetails("BTC",null,null,null,null,null);
        toResultString(LOG, "result", result);
    }

    /**
     * 获取充值地址信息 Get Deposit Address
     * GET /api/v5/asset/deposit-address
     */
    @Test
    public void getDepositAddress() {
        OkexResponse<List<DepositAddress>> result = fundingAPIService.getDepositAddress("EOS");
        toResultString(LOG, "result", result);
    }

    /**
     * 获取充值记录 Get Deposit History
     * GET /api/v5/asset/deposit-history
     */
    @Test
    public void getDepositHistory() {
        OkexResponse<List<DepositInfo>> result = fundingAPIService.getDepositHistory("BTC", "","", "", "", "","","");
        toResultString(LOG, "result", result);
    }

    /**
     * 提币 withdrawal
     * POST /api/v5/asset/withdrawal
     */
    @Test
    public void Withdrawal() {
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setCurrency("USDT");
        withdrawal.setChain("");
        withdrawal.setAmount("100");
        withdrawal.setDestination(Withdrawal.Destination.INTERNAL);
        withdrawal.setToAddress("46674851");
        withdrawal.setFee("1");
        withdrawal.setClientId(null);
        withdrawal.setAreaCode(null);
        OkexResponse<List<WithdrawResult>> result = fundingAPIService.withdrawal(withdrawal);
        toResultString(LOG, "result", result);
    }

    /**
     * 获取提币记录 Get Withdrawal History
     * GET /api/v5/asset/withdrawal-history
     */
    @Test
    public void getWithdrawalHistory() {
        JSONObject result = fundingAPIService.getWithdrawalHistory("USDT", "","","", "", "", "","","");
        toResultString(LOG, "result", result);
    }

    /**
     * 余币宝申购/赎回 PiggyBank Purchase/Redemption
     * rate 仅适用于申购,申购时必填
     * POST /api/v5/asset/purchase_redempt
     */
    @Test
    public void piggyBankPurchaseRedemption() {
        PiggyBankPurchaseRedemption piggyBankPurchaseRedemption = new PiggyBankPurchaseRedemption();
        piggyBankPurchaseRedemption.setCcy("USDT");
        piggyBankPurchaseRedemption.setAmt("1");
        piggyBankPurchaseRedemption.setSide("purchase");
        piggyBankPurchaseRedemption.setRate("0.02");
        JSONObject result = fundingAPIService.piggyBankPurchaseRedemption(piggyBankPurchaseRedemption);
        toResultString(LOG, "result", result);
    }

    /**
     * 获取余币宝余额 Get PiggyBank Balance
     * GET /api/v5/asset/piggy-balance
     */
    @Test
    public void getPiggyBalance(){
        JSONObject result = fundingAPIService.piggyBalance("USDT");
        toResultString(LOG,"result",result);
    }

    /**
     * 闪电网络充币  Lightning deposits
     * GET /api/v5/asset/deposit-lightning
     */
    @Test
    public void depositLightning() {
        JSONObject result = fundingAPIService.depositLightning("BTC","1","6");
        toResultString(LOG, "result", result);
    }

    /**
     * 闪电网络提币  Lightning withdrawals
     * POST /api/v5/asset/withdrawal-lightning
     */
    @Test
    public void withdrawalLightning() {
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setCurrency("");
        withdrawal.setInvoice("");
        JSONObject result = fundingAPIService.withdrawalLightning(withdrawal);
        toResultString(LOG, "result", result);
    }

    /**
     * 设置余币宝借贷利率  Set lending rate
     * POST /api/v5/asset/set-lending-rate
     */
    @Test
    public void SetLendingRate() {
        SetLendingRate setLendingRate = new SetLendingRate();
        setLendingRate.setCcy("BTC");
        setLendingRate.setRate("0.03");
        JSONObject result = fundingAPIService.SetLendingRate(setLendingRate);
        toResultString(LOG, "result", result);
    }

    /**
     * 获取余币宝出借明细  Get lending history
     * GET /api/v5/asset/lending-history
     */
    @Test
    public void lendingHistory() {
        JSONObject result = fundingAPIService.lendingHistory(null,null,null,null);
        toResultString(LOG, "result", result);
    }

    /**
     * 获取市场借贷信息（公共） Get public borrow info (public)
     * GET /api/v5/asset/lending-history
     */
    @Test
    public void lendingRateSummary() {
        JSONObject result = fundingAPIService.lendingRateSummary(null);
        toResultString(LOG, "result", result);
    }

    /**
     * 获取市场借贷历史（公共）  Get public borrow history (public)
     * GET /api/v5/asset/lending-history
     */
    @Test
    public void lendingRateHistory() {
        JSONObject result = fundingAPIService.lendingRateHistory(null,null,null,null);
        toResultString(LOG, "result", result);
    }


    /**
     * 小额资产兑换 convert-dust-assets
     * POST /api/v5/asset/convert-dust-assets
     */
    @Test
    public void convertDustAssets() {
        ConvertDustAssets convertDustAssets = new ConvertDustAssets();
        ArrayList<String> list = new  ArrayList<String>();
        list.add("OKB");
        convertDustAssets.setCcy(list);
        JSONObject result = fundingAPIService.convertDustAssets(convertDustAssets);
        toResultString(LOG, "result", result);
    }

    /**
     * 撤销提币 cancel-withdrawal
     * POST /api/v5/asset/cancel-withdrawal
     */
    @Test
    public void cancelWithdrawal() {
        Withdrawal cancelWithdrawal = new Withdrawal();
        cancelWithdrawal.setWithdrawalId("");
        JSONObject result = fundingAPIService.cancelWithdrawal(cancelWithdrawal);
        toResultString(LOG, "result", result);
    }
    /**
     * 获取不可交易资产 Get non-tradable-assets
     * GET /api/v5/asset/non-tradable-assets
     */
    @Test
    public void getNonTradableAssets(){
        JSONObject result = fundingAPIService.getNonTradableAssets("USDT");
        toResultString(LOG,"result",result);
    }



}




