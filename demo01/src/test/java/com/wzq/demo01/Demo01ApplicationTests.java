package com.wzq.demo01;

import com.wzq.demo01.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo01ApplicationTests {

    @Autowired
    private  HelloController helloController;
    @Test
    public void contextLoads() {

    }

    @Test
    public void test01(){
        helloController.hello();
    }

}
