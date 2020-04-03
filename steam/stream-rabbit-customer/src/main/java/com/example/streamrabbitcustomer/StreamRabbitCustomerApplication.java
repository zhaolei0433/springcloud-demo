package com.example.streamrabbitcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@EnableBinding(value = {Processor.class})
@SpringBootApplication
public class StreamRabbitCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitCustomerApplication.class, args);
    }

}
