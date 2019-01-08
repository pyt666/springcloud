package com.demo.test.springboot_test.exception;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName WebExceptionAspect
 * @Author pyt
 * @Date 2018/12/26 10:14
 */
@Aspect
@Component
public class WebExceptionAspect {
    private static final Logger logger = LogManager.getLogger(WebExceptionAspect.class);
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void webPointcut(){ }
    @AfterThrowing(pointcut = "webPointcut()",throwing = "e")
    public void handleThrowing(Exception e){
        e.printStackTrace();
        logger.error("发现异常！" + e.getMessage());
        logger.error(JSON.toJSONString(e.getStackTrace()));
    }
}
