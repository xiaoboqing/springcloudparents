package com.wang.emqx.controller;

import com.wang.emqx.entity.WebHookConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * 设备连接状态监控
 */
@Slf4j
@RestController
public class CallbackController {
    @PostMapping("/webHook")
    public void receiveWebHookData(@RequestBody Map<String, Object> param) {

        String action = (String)param.get("action");
        //设备连接成功
        if (WebHookConstant.ACTION_CONNECTED.equals(action)) {
            log.info("设备连接成功=========");
        }
        //设备断开连接成功
        if (WebHookConstant.ACTION_DISCONNECTED.equals(action)) {
            log.info("设备断开连接成功=========");
        }

    }
}
