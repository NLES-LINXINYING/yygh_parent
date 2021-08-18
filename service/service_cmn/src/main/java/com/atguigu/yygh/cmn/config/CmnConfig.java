package com.atguigu.yygh.cmn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author linxinying
 * @version 1.0.0
 * @className CmnConfig.java
 * @description
 * @createTime 2021-08-12 16:44:00
 */

@Configuration
@MapperScan("com.atguigu.yygh.cmn.mapper")
public class CmnConfig {

}
