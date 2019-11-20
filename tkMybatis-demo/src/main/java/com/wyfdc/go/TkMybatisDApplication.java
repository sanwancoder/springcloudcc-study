package com.wyfdc.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan(value={"com.wyfdc.go.mapper"})
@EnableDiscoveryClient
public class TkMybatisDApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TkMybatisDApplication.class,args);
    }
}
