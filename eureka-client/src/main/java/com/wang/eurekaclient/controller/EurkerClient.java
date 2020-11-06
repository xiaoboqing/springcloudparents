package com.wang.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/eurkerClient")
@RestController
public class EurkerClient {

    @Value("${server.port}")
    private String port;

    /**
     * 测试接口
     * @return
     */
    @RequestMapping("/hi")
    public String eurkerClient() {
        return "当前执行的端口号为: " + port;
    }
}
