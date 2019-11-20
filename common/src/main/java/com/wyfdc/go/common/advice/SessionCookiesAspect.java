package com.wyfdc.go.common.advice;

import com.alibaba.fastjson.JSON;
import java.util.Enumeration;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.Session;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Author: wuqing
 */
@Aspect
@Slf4j
@Component
public class SessionCookiesAspect {

  //设置切入点：这里直接拦截被@RestController注解的类
  @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
  public void controllerAspect() {

  }

  /**
   * 前置通知 用于拦截Controller层记录用户的操作
   *
   * @param joinPoint 切点
   */
  @Before("controllerAspect()")
  public  void doBefore(JoinPoint joinPoint) {
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    Cookie[] cookies = request.getCookies();
    HttpSession session = request.getSession();
    if(cookies !=null){
      for(Cookie cookie:cookies){
        log.info("Before Cookie name: {},value: {}",cookie.getName(),cookie.getValue());
      }
    }
    log.info("Before sessionId:{}",session.getId());
  }



}
