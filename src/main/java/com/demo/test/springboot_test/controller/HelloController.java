package com.demo.test.springboot_test.controller;

import com.demo.test.springboot_test.controller.model.Aliyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author pyt
 * @Date 2018/12/24 18:10
 */
@RestController
public class HelloController {
    @Autowired
    private Aliyun aliyun;

    @RequestMapping("hello")
    public String hello(){
        System.out.println(aliyun.getAccessKeyId());
        return "Hello，world！";
    }
}
