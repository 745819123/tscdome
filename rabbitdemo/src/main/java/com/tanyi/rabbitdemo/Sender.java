package com.tanyi.rabbitdemo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class Sender {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(String msg) {
        String content = msg + System.currentTimeMillis();
        System.out.println("sender:"+content);
        amqpTemplate.convertAndSend("hello", content);
    }
}
