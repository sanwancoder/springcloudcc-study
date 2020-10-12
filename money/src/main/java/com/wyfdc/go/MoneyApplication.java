package com.wyfdc.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.wyfdc.go.action.api")
public class MoneyApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MoneyApplication.class,args);
    }}
