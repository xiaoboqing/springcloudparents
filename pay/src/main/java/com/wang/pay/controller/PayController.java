package com.wang.pay.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.wang.pay.config.AlipayConfigInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 支付宝支付接口
 *
 */
@Controller
public class PayController {
    /**
     * 快捷支付调用支付宝支付接口
     * @param model，id，payables，
     * @return Object
     */
    @RequestMapping("alipaySum")
    public Object alipayIumpSum(Model model, String WIDout_trade_no, String WIDsubject, String WIDtotal_amount, String WIDbody,
                                HttpServletResponse response)
            throws Exception {
        System.out.println("请求进来"+WIDtotal_amount);
        String payables = WIDout_trade_no;
        // 订单名称，必填(必须是数字)
        String subject = WIDsubject;
        // 付款金额，必填
        String total_fee = WIDtotal_amount;
        // 商品描述，可空
        String body = WIDbody;
        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfigInfo.gatewayUrl, AlipayConfigInfo.app_id,
                AlipayConfigInfo.merchant_private_key, "json", AlipayConfigInfo.charset,
                AlipayConfigInfo.alipay_public_key, AlipayConfigInfo.sign_type);
        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfigInfo.return_url);
        alipayRequest.setNotifyUrl(AlipayConfigInfo.notify_url);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = sdf.format(new Date());
        // 付款金额，必填
        String total_amount = payables.replace(",", "");
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
                + "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
         System.out.println(result);
        System.out.println("....................................");
        response.setContentType("text/html; charset=gbk");
        PrintWriter out = response.getWriter();
        out.print(result);
        return null;
    }
}
