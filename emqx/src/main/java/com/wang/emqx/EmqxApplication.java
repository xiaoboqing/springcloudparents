package com.wang.emqx;

import com.wang.emqx.mqtt.MqttPushClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;
import java.util.TimerTask;

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
        },0,60 * 1000);

    }

    private static void test(){
        System.out.println("............");
        String topic = "notify/" + String.valueOf(System.currentTimeMillis())+"/#";
        String clientid = String.valueOf(System.currentTimeMillis());
        MqttPushClient.MQTT_HOST = "tcp://47.111.252.79:1883";
        MqttPushClient.MQTT_CLIENTID = clientid;
        MqttPushClient.MQTT_USERNAME = "admin";
        MqttPushClient.MQTT_PASSWORD = "public";

        MqttPushClient client = MqttPushClient.getInstance();
        client.subscribe(topic);
    }
}
