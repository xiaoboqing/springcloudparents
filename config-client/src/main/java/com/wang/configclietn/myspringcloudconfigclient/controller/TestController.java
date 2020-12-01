package com.wang.configclietn.myspringcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope //开启更新功能
@ResponseBody
public class TestController {

    @Value("${foos}")
    private String foos;

    @RequestMapping("/hi")
    public String getFoos() {
        return foos;
    }
}
