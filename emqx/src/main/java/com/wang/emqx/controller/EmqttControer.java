package com.wang.emqx.controller;

import com.wang.emqx.entity.SignIn;
import com.wang.emqx.entity.WebHookConstant;
import com.wang.emqx.mqtt.MqttPushClient;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
@RequestMapping("/mqtt")
public class EmqttControer {

    /**
     * 签到
     */
    @RequestMapping("/signIn")
    public void signIn(SignIn signIn) {
        // 1.解签（解签成功执行第二步，失败直接返回）
        // 2.根据设备编号获取设备登录所需的信息
        // 3.将信息返回到终端
    }

    /**
     * 登录
     * @param request
     * @param id
     */
    @RequestMapping("/hi/{id}")
    private  void test(HttpServletRequest request, @PathVariable("id") String id){
        System.out.println("............"+id);
        String clientid = String.valueOf(System.currentTimeMillis());
        String topic = "test/" +clientid;  // 主题
        MqttPushClient.MQTT_HOST = "tcp://39.99.188.56:1883";
        MqttPushClient.MQTT_CLIENTID = id; // 客户端id
        MqttPushClient.MQTT_USERNAME = "kllink";
        MqttPushClient.MQTT_PASSWORD = "kllink";
        MqttPushClient client = MqttPushClient.getInstance();
       request.getSession().setAttribute(id, client);

        Map<String, String> map = new HashMap<>();

        map.put("name","tom");
        map.put("age", "18");
        map.put("address", "shanghai");

        //
        client.publish(topic, map.toString());
    }

    /**
     * 注销
     * @param request
     * @param id
     * @throws Exception
     */
    @RequestMapping("/close/{id}")
    private void closeContent(HttpServletRequest request, @PathVariable("id") String id) throws Exception {
//        System.out.println(id);
        MqttPushClient  client = (MqttPushClient) request.getSession().getAttribute(id);
        client.close();
    }



        //设备连接成功
//        if (WebHookConstant.ACTION_CONNECTED.equals(action)) {
//            log.info("设备连接成功=========");
//        }
//        //设备断开连接成功
//        if (WebHookConstant.ACTION_DISCONNECTED.equals(action)) {
//            log.info("设备断开连接成功=========");
//        }
//        //设备数据上传
//        if (WebHookConstant.MESSAGE_PUBLISH.equals(action)) {
//            log.info("设备数据上传=========");
//        }

}
