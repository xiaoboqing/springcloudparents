package com.wang.feignconsumer.hiHystric;

import com.wang.feignconsumer.feignService.IFeignConsumer;
import org.springframework.stereotype.Component;

@Component
public class FeignConsumerHiHystric implements IFeignConsumer {

    @Override
    public String outString() {
        return "error message";
    }
}
