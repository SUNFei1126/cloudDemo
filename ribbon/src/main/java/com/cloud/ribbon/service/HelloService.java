package com.cloud.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * @description ${description}
 * Created by sunyufei on 2019/6/28.
 */
@Service
public class HelloService {
    public String sayHello(){
        return "helloWorld"; //提供一个hello world
    }
}
