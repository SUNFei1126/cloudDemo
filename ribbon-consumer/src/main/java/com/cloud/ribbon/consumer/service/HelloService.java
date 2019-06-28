package com.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description ${description}
 * Created by sunyufei on 2019/6/28.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHello(){
       return restTemplate.getForObject("http://ribbon-provider/hello?name=lisi",String.class);
    }
}
