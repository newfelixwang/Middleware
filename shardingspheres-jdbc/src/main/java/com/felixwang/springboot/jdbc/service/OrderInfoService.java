package com.felixwang.springboot.jdbc.service;

import com.felixwang.springboot.jdbc.entity.OrderInfo;

import java.util.List;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  22:08
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description
 */
public interface OrderInfoService {

    int insertOrderInfo(OrderInfo orderInfo);

    List<OrderInfo> selectAllList( );

    OrderInfo selectOne(String id);
}
