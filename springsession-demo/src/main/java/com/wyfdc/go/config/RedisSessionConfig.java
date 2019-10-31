package com.wyfdc.go.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Author: wuqing
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}
