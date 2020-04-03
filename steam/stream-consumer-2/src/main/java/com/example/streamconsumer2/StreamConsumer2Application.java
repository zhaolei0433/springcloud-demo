package com.example.streamconsumer2;

import com.example.streamconsumer2.message.Sink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(value = {Sink.class})
@SpringBootApplication
public class StreamConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer2Application.class, args);
    }

}
