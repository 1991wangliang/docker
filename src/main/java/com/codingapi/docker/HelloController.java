package com.codingapi.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by lorne on 2018/3/17
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello CodingApi";
    }
}
