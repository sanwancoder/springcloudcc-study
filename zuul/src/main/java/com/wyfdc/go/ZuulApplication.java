package com.wyfdc.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ZuulApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
