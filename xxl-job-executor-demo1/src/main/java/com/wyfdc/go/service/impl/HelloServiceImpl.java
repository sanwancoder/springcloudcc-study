package com.wyfdc.go.service.impl;

import com.wyfdc.go.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author:  
 */
@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

  @Override
  public String helloName(String name){
    String rs = "hello, "+name;
    System.out.println("hello, "+name);
    return rs;
  }

}
