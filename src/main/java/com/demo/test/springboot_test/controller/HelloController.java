package com.demo.test.springboot_test.controller;

import com.demo.test.springboot_test.controller.model.Aliyun;
import com.demo.test.springboot_test.controller.model.Result;
import com.demo.test.springboot_test.dto.User;
import com.demo.test.springboot_test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @ClassName HelloController
 * @Author pyt
 * @Date 2018/12/24 18:10
 */
@RestController
public class HelloController {
    @Autowired
    private Aliyun aliyun;
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public Result hello(@RequestBody @Validated User user, BindingResult br){
        System.out.println(aliyun.getAccessKeyId());
       return helloService.hello(user,br);
    }
}
