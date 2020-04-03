package com.example.streamconsumer2.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author zhaolei
 * Create: 2019/12/26 19:03
 * Modified By:
 * Description:
 */
@Component
public class MessageReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageReceiver.class);

    @StreamListener(Sink.INPUT1)
    public void receiveMessageFromChannel1(@Payload Message<String> payload, @Header(AmqpHeaders.CONSUMER_QUEUE) String partition){
        LOGGER.info("ReceiveMessageFrom INPUT1, message: {}, Queue:{}", payload.getPayload(), partition);
    }

    @StreamListener(Sink.INPUT2)
    public void receiveMessageFromChannel2(@Payload Message<String> payload, @Header(AmqpHeaders.CONSUMER_QUEUE) String partition){
        LOGGER.info("ReceiveMessageFrom INPUT2, message: {}, Queue:{}", payload.getPayload(), partition);
    }

    @StreamListener(Sink.INPUT3)
    public void receiveMessageFromChannel3(@Payload Message<String> payload, @Header(AmqpHeaders.CONSUMER_QUEUE) String partition){
        LOGGER.info("ReceiveMessageFrom INPUT3, message: {}, Queue:{}", payload.getPayload(), partition);
    }
}
