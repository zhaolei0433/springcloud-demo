package com.example.streamproducer.message;

import com.example.streamproducer.vo.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

/**
 * @author zhaolei
 * Create: 2019/12/26 16:24
 * Modified By:
 * Description:
 */
public class MessageSender {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageSender.class);

    @Resource
    Source source;

    /**
     * 第一种方法, 没有指定output的MessageChannel, 通过OutputInterface去拿具体的Channel
     * 设置partitionKey主要是为了分区用, 可以根据根据这个partitionKey来分区
     */
    public void sendMessageMethod1() {
        Message message = MessageBuilder.withPayload("From sendMessageMethod1")
                .setHeader("partitionKey", 1)
                .build();

        source.output1().send(message);
    }

    /**
     * 第二种方法, 直接指定output的MessageChannel
     */
    @Resource
    @Qualifier(Source.OUTPUT2)
    MessageChannel output;

    public void sendMessageMethod2() {
        Person p = new Person();
        p.setName("Person2");
        p.setAge(1);

        output.send(MessageBuilder.withPayload(p)
                .setHeader("partitionKey", 2)
                .build());
    }
}
