package com.demo.test.springboot_test.controller.Configs;

import com.demo.test.springboot_test.controller.model.Aliyun;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName AliyunConfig
 * @Author pyt
 * @Date 2018/12/25 16:32
 */
@SpringBootConfiguration
public class AliyunConfig {
    @Value("${aliyun.accessKeyId}")
    private String accessKeyId;
    @Value("${aliyun.accessKeySecret}")
    private String accessKeySecret;
    @Value("${aliyun.verifyCode}")
    private String verifyCode;
    @Bean
    public Aliyun aliyun(){
        return Aliyun.options()
                .setAccessKeyId(accessKeyId)
                .setAccessKeySecret(accessKeySecret)
                .setVerifyCode(verifyCode)
                .build();
    }
}
