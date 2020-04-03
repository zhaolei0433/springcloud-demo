package com.example.streamproducer.service.impl;

import com.example.streamproducer.message.Source;
import com.example.streamproducer.service.IProducerService;
import com.example.streamproducer.vo.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhaolei
 * Create: 2019/12/26 17:50
 * Modified By:
 * Description:
 */
@Service
public class ProducerServiceImpl implements IProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerServiceImpl.class);

    @Resource
    Source source;

    @Override
    public void sendMessageMethod1() {
        Person p = new Person();
        p.setName("Person2");
        p.setAge(1);
        Message message = MessageBuilder.withPayload("无分区，无分组").build();
        source.output1().send(message);
        LOGGER.info("sendMessageMethod1:{}",message.getPayload());
    }

    @Override
    public void sendMessageMethod2() {
        Message message = MessageBuilder.withPayload("无分区，有分组").build();
        source.output2().send(message);
        LOGGER.info("sendMessageMethod1:{}",message.getPayload());
    }

    @Override
    public void sendMessageMethod3() {
        Message message = MessageBuilder.withPayload("有分区，必有分组")
                .setHeader("partitionKey", 0)
                .build();
        source.output3().send(message);
        LOGGER.info("sendMessageMethod1:{}", message.getPayload());
    }
}
