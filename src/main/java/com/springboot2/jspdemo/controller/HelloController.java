package com.springboot2.jspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author zc
 * @create 2019-05_26-10:55
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Map<String, Object> map){
        System.out.println("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        map.put("hello", "你好啊");
        return "hello";
    }

}
