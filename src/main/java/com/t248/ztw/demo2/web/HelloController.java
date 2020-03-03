package com.t248.ztw.demo2.web;

import com.t248.ztw.demo2.comm.KtjiaoyuInfo;
import com.t248.ztw.demo2.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    /*@Value("${com.ktjiaoyu.name}")
    public String name;
    @Value("${com.ktjiaoyu.email}")
    public String email;*/
    @Resource
    private KtjiaoyuInfo ktjiaoyuInfo;
    @Autowired
    private DemoService demoService;
    @RequestMapping("/hello")
    public String hello() {
        String msg = demoService.sayHello();
        //msg += ""+name + "" +email;
        msg += " " + ktjiaoyuInfo.getName() +" " +ktjiaoyuInfo.getEmail();
        return msg;
    }
}
