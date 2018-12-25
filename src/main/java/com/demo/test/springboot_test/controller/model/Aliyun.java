package com.demo.test.springboot_test.controller.model;

/**
 * @ClassName Aliyun
 * @Author pyt
 * @Date 2018/12/25 16:03
 */
public class Aliyun {
    private String accessKeyId;
    private String accessKeySecret;
    private String verifyCode;

    public static class Builder{
        private String accessKeyId;
        private String accessKeySecret;
        private String verifyCode;

        public Builder setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        public Builder setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        public Builder setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }

        public Aliyun build(){
            return new Aliyun(this);
        }
    }

    public static  Builder options(){
        return new Aliyun.Builder();
    }

    private Aliyun(Builder builder){
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.verifyCode = builder.verifyCode;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public String getVerifyCode() {
        return verifyCode;
    }
}
