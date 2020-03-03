package com.t248.ztw.demo2.service.impl;

import com.t248.ztw.demo2.service.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
