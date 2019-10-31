package com.wyfdc.go.action;

import com.wyfdc.go.action.api.HelloActionApi;
import com.wyfdc.go.common.response.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Woo
 */
@RequestMapping("/api/hello")
@RestController
public class HelloAction implements HelloActionApi {

  @Override
  @GetMapping("/user-name/{userName}")
  public ResponseData<String> helloSir(@PathVariable("userName") String userName){
    return new ResponseData<>("hello, "+userName);
  }

}
