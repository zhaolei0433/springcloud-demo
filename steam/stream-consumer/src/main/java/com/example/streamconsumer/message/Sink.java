package com.example.streamconsumer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.binder.PollableMessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @author zhaolei
 * Create: 2019/12/26 18:41
 * Modified By:
 * Description:
 */
@Component
public interface Sink {
    //这里的input1要与配置文件bindings下的名称对应
    String INPUT1 = "input1";
    String INPUT2 = "input2";
    String INPUT3 = "input3";
    String INPUT4 = "input4";

    //事件的接收方式
    @Input(INPUT1)
    MessageChannel input1();

    @Input(INPUT2)
    MessageChannel input2();

    @Input(INPUT3)
    MessageChannel input3();
}
