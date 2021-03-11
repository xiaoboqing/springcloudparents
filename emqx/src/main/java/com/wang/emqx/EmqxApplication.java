package com.wang.emqx;

import com.wang.emqx.mqtt.MqttPushClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 订阅消息
 */
@SpringBootApplication
public class EmqxApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmqxApplication.class, args);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    test();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },0,1 * 100);

    }

    private static void test(){

        String clientid = String.valueOf(System.currentTimeMillis());
        String topic = "notify/test";  // 主题
        MqttPushClient.MQTT_HOST = "tcp://39.99.188.56:18830";
        MqttPushClient.MQTT_CLIENTID = clientid; // 客户端id
        MqttPushClient.MQTT_USERNAME = "Gx9akIQEN1agqxJCWAf1";
        MqttPushClient.MQTT_PASSWORD = "ProIVPXfNsxNBXX4LfHj";

        MqttPushClient client = MqttPushClient.getInstance();
        client.subscribe(topic);  // 调用订阅方法
    }
}
