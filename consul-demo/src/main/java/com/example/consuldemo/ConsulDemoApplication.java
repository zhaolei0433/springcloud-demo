package com.example.consuldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulDemoApplication.class, args);
    }

    @Value("${myName}")
    private String myName;

    @RequestMapping("/myname")
    public String testHello() {
        System.out.println("my name is : " + myName);
        return myName;
    }


}
