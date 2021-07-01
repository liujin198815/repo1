package com.kuang.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController相当于是
 * @Controller+@ResponseBody
 *
 * @Slf4j 使用lombok简化日志开发
 */
@Slf4j
@RestController
public class Mycontroller {
    @RequestMapping("/hello1")
    public String testHello(){
        log.info("日志启动");
        return "hello world 你好世界!";
    }
}
