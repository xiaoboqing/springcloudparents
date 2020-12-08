package com.wang.emqx;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmqxApplicationTests {

    @Test
    void contextLoads() {


    }

    void connect() {
        String subTopic = "testtopic/#";
        String pubTopic = "testtopic/1";
        String content = "Hello World";
        int qos = 2;
        String broker = "tcp://47.111.252.79:1883";
        String clientId = "emqx_test";
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            MqttClient client = new MqttClient(broker, clientId, persistence);

            // MQTT 连接选项
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setUserName("amdin");
            connOpts.setPassword("public".toCharArray());
            // 保留会话
            connOpts.setCleanSession(true);

            // 设置回调
             client.setCallback(new OnMessageCallback());

            // 建立连接
            System.out.println("Connecting to broker: " + broker);
            client.connect(connOpts);

            System.out.println("Connected");
            System.out.println("Publishing message: " + content);

            // 订阅
            client.subscribe(subTopic);

            // 消息发布所需参数
            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            client.publish(pubTopic, message);
            System.out.println("Message published");

            ///client.disconnect();
            System.out.println("Disconnected");
            //client.close();
            System.exit(0);
        } catch (MqttException me) {
            System.out.println("reason " + me.getReasonCode());
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            System.out.println("excep " + me);
            me.printStackTrace();
        }

    }

    class OnMessageCallback implements MqttCallback {
        public void connectionLost(Throwable cause) {
            // 连接丢失后，一般在这里面进行重连
            connect();
            System.out.println("连接断开，可以做重连");
        }

        public void messageArrived(String topic, MqttMessage message) throws Exception {
            // subscribe后得到的消息会执行到这里面
            System.out.println("接收消息主题:" + topic);
            System.out.println("接收消息Qos:" + message.getQos());
            System.out.println("接收消息内容:" + new String(message.getPayload()));
        }

        public void deliveryComplete(IMqttDeliveryToken token) {
            System.out.println("deliveryComplete---------" + token.isComplete());
        }
    }

}
