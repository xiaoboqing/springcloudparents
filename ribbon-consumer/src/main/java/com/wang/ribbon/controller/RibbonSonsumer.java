package com.wang.ribbon.controller;

import com.wang.ribbon.iRibbonService.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ribbonSonsumer")
@RestController
public class RibbonSonsumer {

    @Autowired
    private IRibbonService iRibbonService;

    /**
     * ribbon
     * @return
     */
    @RequestMapping("/hi")
    public String ribbonSonsumer() {
        return iRibbonService.ribbonConsumer();
    }

}
