package com.atguigu.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author linxinying
 * @version 1.0.0
 * @className HospConfig.java
 * @description
 * @createTime 2021-08-10 14:38:00
 */

@Configuration
@MapperScan("com.atguigu.yygh.hosp.mapper")
public class HospConfig {

}
