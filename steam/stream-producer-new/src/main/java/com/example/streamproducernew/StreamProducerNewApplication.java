package com.example.streamproducernew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@SpringBootApplication
public class StreamProducerNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamProducerNewApplication.class, args);
	}

}
