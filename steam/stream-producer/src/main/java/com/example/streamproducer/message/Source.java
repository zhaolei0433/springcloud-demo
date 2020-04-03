package com.example.streamproducer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @author zhaolei
 * Create: 2019/12/26 16:23
 * Modified By:
 * Description:
 */
@Component
public interface Source {

    String OUTPUT1 = "output1";
    String OUTPUT2 = "output2";
    String OUTPUT3 = "output3";

    @Output(OUTPUT1)
    MessageChannel output1();

    @Output(OUTPUT2)
    MessageChannel output2();

    @Output(OUTPUT3)
    MessageChannel output3();
}
