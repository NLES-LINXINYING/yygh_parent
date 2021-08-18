package com.atguigu.yygh.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author linxinying
 * @version 1.0.0
 * @className ServiceCmnApplication.java
 * @description
 * @createTime 2021-08-12 16:41:00
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})
public class ServiceCmnApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCmnApplication.class, args);
    }
}
