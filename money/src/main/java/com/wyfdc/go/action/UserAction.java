package com.wyfdc.go.action;

import com.wyfdc.go.action.api.HelloActionApi;
import com.wyfdc.go.common.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author:
 */
@RequestMapping("/api/money")
@RestController
public class UserAction   {

  @Autowired
  private HelloActionApi helloActionApi;

  @GetMapping("/user-name/{userName}")
  public ResponseData<String> helloSir(@PathVariable("userName") String userName){
    String s = helloActionApi.helloSir(userName).getData();
    return new ResponseData<>(s+",账户余额："+ (new Random()).nextInt(10)+" 万元");
  }

}
