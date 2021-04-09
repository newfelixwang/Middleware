package com.felixwang.springboot.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  20:39
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description
 */
@SpringBootApplication
@MapperScan("com.felixwang.springboot.jdbc.mapper")
public class SpringBootJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcApplication.class,args);
    }
}
