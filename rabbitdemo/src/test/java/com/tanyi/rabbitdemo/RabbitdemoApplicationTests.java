package com.tanyi.rabbitdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitdemoApplicationTests {

    @Autowired
    Sender sender;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 10000; i++)
            sender.send(i + "测试");
    }

}
