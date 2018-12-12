package com.sinowaycredit.hdms.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangSen
 * @Description:
 * @Date: Creted in 16:07 2018/9/17
 * @Modified by:
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    private String hello(){
        return "helloBoot";
    }
}
