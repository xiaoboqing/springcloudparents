package com.wang.ribbon.ribbonService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wang.ribbon.iRibbonService.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon service层实现类
 */
@Service
public class RibbonService implements IRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Ribbon 测试接口
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "hystrixError" )
    public String ribbonConsumer() {
        return restTemplate.getForObject("http://SERVICE-HI/eurkerClient/hi", String.class);
    }

    public String hystrixError() {
        return "error message";
    }
}
