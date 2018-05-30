package com.tanyi.common.uitls;

import org.junit.Test;

public class SnowflakeIdWorkerTest {

    @Test
    public void nextId() throws Exception {
        SnowflakeIdWorker worker = new SnowflakeIdWorker(12, 12);
        long start = System.currentTimeMillis();
        long cur = System.currentTimeMillis();
        int count = 0;
        while (cur - start <= 1000) {
            System.out.println("one:" + worker.nextId());
            cur = System.currentTimeMillis();
            count++;
        }
        System.out.println(count);


    }

}