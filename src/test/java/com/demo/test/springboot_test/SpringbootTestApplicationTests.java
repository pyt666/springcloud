package com.demo.test.springboot_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestApplicationTests {
    private static long _TEN_THOUSAND=10000;
    @Test
    public void contextLoads() {
        long times=1000*_TEN_THOUSAND;
        long t1=System.currentTimeMillis();
        testSystem(times);
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);

        testCalander(times);
        long t3=System.currentTimeMillis();
        System.out.println(t3-t2);

        testDate(times);
        long t4=System.currentTimeMillis();
        System.out.println(t4-t3);
    }
    public static void testSystem(long times){
        for(int i=0;i<times;i++){
            long currentTime=System.currentTimeMillis();
        }
    }

    public static void testCalander(long times){
        for(int i=0;i<times;i++){
            long currentTime= Calendar.getInstance().getTimeInMillis();
        }
    }

    public static void testDate(long times){
        for(int i=0;i<times;i++){
            long currentTime=new Date().getTime();
        }
    }
}

