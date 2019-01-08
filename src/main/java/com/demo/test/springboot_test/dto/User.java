package com.demo.test.springboot_test.dto;

import com.demo.test.springboot_test.validation.emailvalidation.EmailValidation;
import com.demo.test.springboot_test.validation.phone_validation.PhoneValidation;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @ClassName User
 * @Author pyt
 * @Date 2019/1/7 14:36
 */
public class User {
    @NotNull
    private String name;
    @DecimalMin("10")
    private Integer age;
    @NotNull
    @PhoneValidation
    private String phone;
    @NotNull
    @Email
    @EmailValidation
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
