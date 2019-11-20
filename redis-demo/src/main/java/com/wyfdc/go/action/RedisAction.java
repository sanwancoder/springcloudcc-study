package com.wyfdc.go.action;

import com.wyfdc.go.common.response.ResponseData;
import com.wyfdc.go.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/redis")
@Api(tags = "redis 测试API")
public class RedisAction {

  @Autowired
  private RedisService redisService;


  @GetMapping("/{key}")
  @ApiOperation(value="根据key获取缓存")
  public ResponseData<String> get(@PathVariable("key") String key) {
     return  new ResponseData<>(key);
  }
}
