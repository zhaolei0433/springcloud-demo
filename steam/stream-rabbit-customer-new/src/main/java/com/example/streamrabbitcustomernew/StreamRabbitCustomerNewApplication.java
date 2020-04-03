package com.example.streamrabbitcustomernew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class StreamRabbitCustomerNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamRabbitCustomerNewApplication.class, args);
	}

	/*@Bean
	public Function<String, String> uppercase() {
		return value -> {
			System.out.println("Received: " + value);
			return value.toUpperCase();
		};
	}*/

	@Bean
	public Consumer<String> receive1() {
		return System.out::println;
	}

	@Bean
	public Consumer<String> receive2() {
		return System.out::println;
	}

	@Bean
	public Consumer<String> receive3() {
		return System.out::println;
	}
}
