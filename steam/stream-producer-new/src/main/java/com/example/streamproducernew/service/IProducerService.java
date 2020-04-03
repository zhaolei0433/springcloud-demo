package com.example.streamproducernew.service;

/**
 * @author zhaolei
 * Create: 2019/12/26 17:50
 * Modified By:
 * Description:
 */
public interface IProducerService {

    //无分区，无分组
    void sendMessageMethod1();

    //无分区，有分组
    void sendMessageMethod2();

    //有分区，有分组
    void sendMessageMethod3();
}
