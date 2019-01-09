package com.demo.test.springboot_test.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.demo.test.springboot_test.controller.model.Result;
import com.demo.test.springboot_test.dto.User;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @ClassName HelloService
 * @Author pyt
 * @Date 2019/1/7 16:30
 */
@Service
public class HelloService {
    public Result hello( User user, BindingResult br){

        System.out.println(br.getAllErrors());
        int count = br.getErrorCount();
        System.out.println("错误数量："+count);

        Result result = new Result();
        if (count>=1){
            JSONObject jsonObject = new JSONObject();
            JSONArray array = new JSONArray();
            List<FieldError> errors  = br.getFieldErrors();
            for (FieldError error : errors){
                JSONObject object = new JSONObject();
                object.put(error.getField(),error.getDefaultMessage());
                array.add(object);
            }
            jsonObject.put(br.getObjectName(),array);
            result.setCode(400);
            result.setMessage(jsonObject.toJSONString());
        }else{
            result.setCode(200);
        }
        return result;
    }

    public String Hello(User user){
        return user.getName();
    }
}
