package com.felixwang.springboot.jdbc.service.Impl;

import com.felixwang.springboot.jdbc.entity.OrderInfo;
import com.felixwang.springboot.jdbc.mapper.OrderInfoMapper;
import com.felixwang.springboot.jdbc.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  22:09
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public int insertOrderInfo(OrderInfo orderInfo) {
        return orderInfoMapper.insert(orderInfo);
    }

    @Override
    public List<OrderInfo> selectAllList() {
        return orderInfoMapper.selectList(null);
    }

    @Override
    public OrderInfo selectOne(String id) {
        return orderInfoMapper.selectById(Long.parseLong(id));
    }
}
