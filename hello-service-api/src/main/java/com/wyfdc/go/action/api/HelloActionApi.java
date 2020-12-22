package com.wyfdc.go.action.api;

import com.wyfdc.go.common.response.ResponseData;
import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:  
 */
@FeignClient(name="hello")
@RequestMapping("/api/hello")
public interface HelloActionApi {


  @GetMapping("/user-name/{userName}")
  ResponseData<String>  helloSir(@PathVariable("userName") String userName);

}



