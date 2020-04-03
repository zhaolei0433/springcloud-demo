package com.example.streamproducernew.service.impl;

import com.example.streamproducernew.service.IProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

/**
 * @author zhaolei
 * Create: 2019/12/26 17:50
 * Modified By:
 * Description:
 */
@Service
public class ProducerServiceImpl implements IProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerServiceImpl.class);

    private EmitterProcessor<String> processor1 = EmitterProcessor.create();

    private EmitterProcessor<String> processor2 = EmitterProcessor.create();

    private EmitterProcessor<String> processor3 = EmitterProcessor.create();

    @Bean
    public Supplier<Flux<String>> processor1() { return () -> processor1; }

    @Bean
    public Supplier<Flux<String>> processor2() {
        return () -> processor2;
    }

    @Bean
    public Supplier<Flux<String>> processor3() {
        return () -> processor3;
    }


    @Override
    public void sendMessageMethod1() {
        processor1.onNext("无分区，无分组");
    }

    @Override
    public void sendMessageMethod2() {
        processor2.onNext("无分区，有分组");
    }

    @Override
    public void sendMessageMethod3() {
        processor3.onNext("有分区，有分组");
    }
}
