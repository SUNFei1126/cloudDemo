package com.cloud.feign.service;

import com.cloud.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description ${description}
 * Created by sunyufei on 2019/6/28.
 */
@Service
public class HelloService {
    @Autowired
    private GetHello getHello; //注入rpc

    public String sayHello(){
        return getHello.sayHello();
    }
}
