package com.wyfdc.go;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wyfdc.go.dao")
public class HelloDemoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HelloDemoApplication.class,args);
    }
}
