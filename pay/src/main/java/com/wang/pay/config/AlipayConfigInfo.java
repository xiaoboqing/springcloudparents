package com.wang.pay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfigInfo {

    // ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id="2016110100784273";//例：2016082600317257
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDMfpqUomaw4PAVrmSCs" +
            "7VSz09uxWUvz5/weHBTEjq+fb5sCI2ClTRyRhxRPJ8ImI8mSPxv0eoU0f4Bd50Et98T1l/QhsrKxnNcbyTVpCuW8sQ7U60cfS2K7WU059R" +
            "x0LyZ9spT36dfEIuJ+H5jjv2GssEq2j3rwxsERmYdkx8Ccw1SW5Q6TtOT9l6Ly8ohFjqSTZt6k5nEqrV43cKnuWVSMz1FnavJCIw2BwC996" +
            "53tMbnrMRh28qELzeGIOSl+ORwMQWhlIuK0EZA75Q6Y54Ci4z9dS371SDcl7W4/j33BkO55xtllp3amQ8MlzHUz+n5fyh524iLnkHs25IxK" +
            "5yDAgMBAAECggEBALJT6Xuaj9DJp7RQiygLjSE01gE0NIRYHBK5BML8j6vUvf06DCWG9eB9UW5qXglB+PubBECDHw2e/lHLPGuD6Q5EkPOo" +
            "yCnCm5FM/yMrcjPFauiNlNXWN6QCV5KmZHYIYKAnPdOcozlclULxJ06swFv5gEhdX0g8sU+uEJjT1mPr39B47e6+A/xqwVJlNgMge05UdpFT" +
            "QrX/axS/DsZNeZfawI6cc7rL2694T4zMCPAm/W807bNX3DDWhcNyu74lR5rWFvyZuHXJL+63FEgezd4qPn9AMZ8AFnvLDA/lrjSRO9YSy7dbY" +
            "WHwm8o7C92ulkL4mxpczJk/ENRWZfZLsPECgYEA6pzpRy9jMdkOEi80zxqT+o2hwXgASiL3BAfhJAfdl5Yiz+zlxDQhTeWWSR5QfCYhltzJUXo" +
            "diSSeRBg30SE9x1jeRX3GDzyzkp46xxYg7fHnPGA391Gxth1RKS99ON/GAa1e9xj6jVXv1T+JasiiSAerovYYcud/I2Cswr4UJYsCgYEA3y" +
            "LURGq4hNvSqyqsga2RoDMvnxbodGERkjzFL2jEDNDlaPSE/ZwrsLzwfbELOfNdhtoHy3hP4/UjSx4RbhG+33j074KwknZWnwEKo6zgTHLYzRR8T3YjhJEWJUiaidFTgiyTBw/Qt1LfeyRkpTYxUJxAzLpMeKFb+uYmWhroc+kCgYA7TN/12zdyYQ+abw4lDu26VdQ954wDMSVIgolYpxhOeWdhMNq+pgKJAu/imWP0jVrOHA5SptASWwwZ4BkzpfhMi9zaqbjHHyuwcogezCwUmKE+9H8Q5zhI9M4P3+4B0yXkRKMNR+YElWUifIXKVN4X4MB0V0nEuVi8Y3InYw4KkwKBgEt2Z/tLbGPiQ/kHUZf5r0pShUR0ZuEVAvBGBRnngIYlD7DTITbz3gLDo0Ge4oESwQqeKgyx/7LEcM8yuApVjgvdyFhIBpdB1kGoBIUeLi0smg2hY/krpw9qUecCCuGZHXjkwkSdIKUfLd1jjXYiQcNVVMToLHyPdaAAve+zMfIhAoGABB/D637STuQ7Xch8wNKVXEvCAGh2UvMxwszK4oYKTsGCr/uEM0osGN0o8TKsfVVs8kEfXYXmnVPltnJQ5AptiBAvhfNYBNnFXuZZw8DIcnKhWUNQcGsOxiF183oJK8Ig7yiU4wwmJw45uN8ylVUhyB8ZmstIELDEnV7An/72LFg=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzH6alKJmsODwFa5kgrO1Us9PbsVlL8+f8HhwUxI6vn2+bAiNgpU0ckYcUTyfCJiPJkj8b9HqFNH+AXedBLffE9Zf0IbKysZzXG8k1aQrlvLEO1OtHH0tiu1lNOfUcdC8mfbKU9+nXxCLifh+Y479hrLBKto968MbBEZmHZMfAnMNUluUOk7Tk/Zei8vKIRY6kk2bepOZxKq1eN3Cp7llUjM9RZ2ryQiMNgcAvfeud7TG56zEYdvKhC83hiDkpfjkcDEFoZSLitBGQO+UOmOeAouM/XUt+9Ug3Je1uP499wZDuecbZZad2pkPDJcx1M/p+X8oeduIi55B7NuSMSucgwIDAQAB";
    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 返回的时候此页面不会返回到用户页面，只会执行你写到控制器里的地址
     */
    public static String notify_url = "http://snid.alited.com//importView";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 此页面是同步返回用户页面，也就是用户支付后看到的页面，上面的notify_url是异步返回商家操作，谢谢
     * 要是看不懂就找度娘，或者多读几遍，或者去看支付宝第三方接口API，不看API直接拿去就用，遇坑不怪别人,要使用外网能访问的ip,建议使用花生壳,内网穿透
     */
    public static String return_url = "http://snid.alited.com//importView";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关https://openapi.alipaydev.com/gateway.do
    public static String gatewayUrl="https://openapi.alipaydev.com/gateway.do";

}
