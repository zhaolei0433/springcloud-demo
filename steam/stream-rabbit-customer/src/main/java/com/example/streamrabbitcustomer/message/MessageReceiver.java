package com.example.streamrabbitcustomer.message;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Component;

/**
 * @author zhaolei
 * Create: 2019/12/26 12:00
 * Modified By:
 * Description:
 */
@Component
public class MessageReceiver {
    @StreamListener(Processor.INPUT)
    public void processMyMessage(String message) {
        System.out.println("接收到消息：" + message);
    }
}
