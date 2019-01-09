package com.demo.test.springboot_test.utils;

import java.util.UUID;

/**
 * @ClassName UUIDGenerator
 * @Description TODO
 * @Author pyt
 * @Date 2019/1/8 16:37
 * @Version
 */
public class UUIDGenerator {

    public static UUID getUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
}
