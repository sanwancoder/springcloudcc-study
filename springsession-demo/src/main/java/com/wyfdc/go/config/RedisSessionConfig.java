package com.wyfdc.go.config;

import static javafx.scene.input.KeyCode.H;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

/**
 * @Author: Woo
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=600)
public class RedisSessionConfig {

  @Bean
  public HttpSessionStrategy httpSessionStrategy(){
      return new HeaderHttpSessionStrategy();
  }


//  @Bean
//  public HeaderHttpSessionIdResolver httpSessionStrategy() {
//    return new HeaderHttpSessionIdResolver("x-auth-token");
//  }

}
