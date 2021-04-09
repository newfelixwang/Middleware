package com.felixwang.springboot.jdbc.entity;

import lombok.Data;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  22:02
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description  基础类
 */

@Data
public class OrderInfo {

    private Long id;
    private String amount;
    private String status;

}
