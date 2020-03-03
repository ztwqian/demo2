package com.t248.ztw.demo2;

import com.t248.ztw.demo2.comm.KtjiaoyuInfo;
import com.t248.ztw.demo2.service.DemoService;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Resource
    private DemoService demoService;

    @org.junit.Test
    public void testSayHello() {
        String msg = demoService.sayHello();
        System.out.println("msg:"+msg);
    }

}
