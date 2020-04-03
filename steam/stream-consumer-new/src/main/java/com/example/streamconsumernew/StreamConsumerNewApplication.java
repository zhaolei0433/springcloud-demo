package com.example.streamconsumernew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class StreamConsumerNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamConsumerNewApplication.class, args);
	}

	//Consumer函数，接收一个参数无返回
	@Bean
	public Consumer<String> receive1() {
		Consumer<String> data = s -> {
			//System.out.println("receive1:"+s);
			throw new RuntimeException("intentional");
		};
		return data;
	}

	@Bean
	public Consumer<String> receive2() {
		return System.out::println;
	}

	@Bean
	public Consumer<String> receive3() {
		return System.out::println;
	}

	//Function函数，接收一个参数，并返回一个参数
	//Flux<T>，是响应式编程的数据流，类似stream
	@Bean
	public Function<Tuple2<Flux<String>, Flux<Integer>>, Flux<String>> aggregate() {
		return tuple -> {
			Flux<String> stringStream = tuple.getT1();
			Flux<String> intStream = tuple.getT2().map(i -> String.valueOf(i));
			return Flux.merge(stringStream, intStream);
		};
	}
}
