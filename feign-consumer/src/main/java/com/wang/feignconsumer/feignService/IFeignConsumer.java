package com.wang.feignconsumer.feignService;

import com.wang.feignconsumer.hiHystric.FeignConsumerHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign 测试接口
 */
@FeignClient(value = "service-hi", fallback = FeignConsumerHiHystric.class)
public interface IFeignConsumer {

    @RequestMapping(value = "/eurkerClient/hi", method = RequestMethod.GET)
    String outString();
}
