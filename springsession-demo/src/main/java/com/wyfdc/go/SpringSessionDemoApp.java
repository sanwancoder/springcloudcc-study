package com.wyfdc.go;

/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringSessionDemoApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringSessionDemoApp.class);
    }
}
