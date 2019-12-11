package com.mydemo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    private String aa = null;

    @Test
    void contextLoads() {
//        System.out.println(aa.isEmpty());
        for(int i=0;i<100;i++){
            System.out.println((int)((Math.random()*9+1)*100000));
        }
    }

}
