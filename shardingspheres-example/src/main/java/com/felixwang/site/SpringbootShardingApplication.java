package com.felixwang.site;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  16:43
 * @Https https:felixwang.site
 * @QQ 2115376870
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.felixwang.site.mapper")
public class SpringbootShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingApplication.class,args);
    }
}
