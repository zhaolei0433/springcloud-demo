package com.example.streamconsumer;

import com.example.streamconsumer.message.Sink;
import com.example.streamconsumer.vo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@EnableBinding(value = {Sink.class})
@SpringBootApplication
public class StreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerApplication.class, args);
    }

}
