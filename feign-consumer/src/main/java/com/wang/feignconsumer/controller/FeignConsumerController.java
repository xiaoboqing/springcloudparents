package com.wang.feignconsumer.controller;

import com.wang.feignconsumer.feignService.IFeignConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feignConsumer")
@RestController
public class FeignConsumerController {

    @Autowired
    private IFeignConsumer iFeignConsumer;

    @RequestMapping("/hi")
    public String outString() {
        return iFeignConsumer.outString();
    }
}
