package com.wyfdc.go.controller;

import com.wyfdc.go.common.response.ResponseData;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuqing
 */
@RestController
@RequestMapping("test")
public class TestController {


  @RequestMapping("now")
  public ResponseData<Date> getNow(){
    return new ResponseData(new Date());
  }

}
