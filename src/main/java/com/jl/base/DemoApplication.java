package com.jl.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wang on 2017-07-27.
 */
@SpringBootApplication
@RestController
public class DemoApplication {
    @RequestMapping(value = "/user")
    public String fiestBoot(){
        return "hello , boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
