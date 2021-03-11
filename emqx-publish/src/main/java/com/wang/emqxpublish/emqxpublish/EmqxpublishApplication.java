package com.wang.emqxpublish.emqxpublish;

import com.wang.emqxpublish.emqxpublish.mqtt.MqttPushClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

/**
 * 发布消息
 */
@SpringBootApplication
public class EmqxpublishApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmqxpublishApplication.class, args);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    test();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },0,10 * 1000);

    }
    private static void test(){

        MqttPushClient.MQTT_HOST = "tcp://39.99.188.56:1883";
        String topic = "notify/test"; // 主题
        MqttPushClient.MQTT_CLIENTID =  UUID.randomUUID() +"G_6058214598723";  // 客户端id
        MqttPushClient.MQTT_USERNAME = "admin";
        MqttPushClient.MQTT_PASSWORD = "public";
        Map<String, String> map = new HashMap<>();

        map.put("name","tom");
        map.put("age", "18");
        map.put("address", "shanghai");
        //       JSONObject jsonMap = JSONObject.fromObject(map);
        MqttPushClient client = MqttPushClient.getInstance();
         //
//        client.publish(topic, map.toString());
    }
}
