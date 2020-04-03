package com.example.streamproducernew.controller;

import com.example.streamproducernew.service.IProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaolei
 * Create: 2019/12/26 17:11
 * Modified By:
 * Description:
 */
@RestController
public class ProducerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerController.class);

    private IProducerService producerService;

    @Autowired
    public ProducerController(IProducerService producerService) {
        this.producerService = producerService;
    }

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String sendMessageMethod1() {
        producerService.sendMessageMethod1();
        return "OK";
    }

    @RequestMapping(value = "/2", method = RequestMethod.GET)
    public String sendMessageMethod2() {
        producerService.sendMessageMethod2();
        return "OK";
    }

    @RequestMapping(value = "/3", method = RequestMethod.GET)
    public String sendMessageMethod3() {
        producerService.sendMessageMethod3();
        return "OK";
    }
}
