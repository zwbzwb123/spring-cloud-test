package org.spring.cloud.springcloudribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "error")
    public String hi(@RequestParam String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }


    public String error(String name){
        return "error,"+name;
    }

}
