package com.wyfdc.go;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages="com.wyfdc.go.transaction.demo.mapper")
public class TransactionDemoApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(TransactionDemoApp.class,args);
    }
}
