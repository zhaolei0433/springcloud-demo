package com.example.streamrabbitcustomer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @author zhaolei
 * Create: 2019/12/26 11:58
 * Modified By:
 * Description:
 */
@Component
public interface Sink {
    String INPUT = "input";

    @Input("input")
    SubscribableChannel input();
}
