package com.wyfdc.go.service.impl;

import com.wyfdc.go.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author:
 */
@Service
@Slf4j
public class RedisServiceImpl implements RedisService {

  private final static String URL_VISIT_ACCOUNT = "URL_VISIT_COUNT";

  @Autowired
  private RedisTemplate redisTemplate;






}
