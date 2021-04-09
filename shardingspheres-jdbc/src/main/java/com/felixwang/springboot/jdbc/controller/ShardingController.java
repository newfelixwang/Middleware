package com.felixwang.springboot.jdbc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.felixwang.springboot.jdbc.entity.OrderInfo;
import com.felixwang.springboot.jdbc.entity.Work;
import com.felixwang.springboot.jdbc.service.OrderInfoService;
import com.felixwang.springboot.jdbc.service.WorkService;
import com.felixwang.springboot.jdbc.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  21:56
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description
 */
@RestController
@RequestMapping("test")
public class ShardingController {

    @Autowired
    private WorkService workService;

    @Autowired
    private OrderInfoService orderInfoService;

    SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);

    @GetMapping("/insertOrderInfo")
    public String insertOrderInfo() {

        for (int i = 0; i < 15; i++) {
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setAmount("金额" + i);
            orderInfo.setStatus("状态" + i);
            orderInfoService.insertOrderInfo(orderInfo);
        }
        return "insert";
    }

    @GetMapping("/selectById")
    public List<OrderInfo> selectById() {
        return orderInfoService.selectAllList();
    }

    @PostMapping("selectOneById")
    public OrderInfo selectOneById(@RequestParam("id") String id) {
        return orderInfoService.selectOne(id);
    }

    @GetMapping("/insertWork")
    public String inserWork(){
        Random random = new Random();
        Work work = new Work();
        work.setId(idWorker.nextId());
        work.setSalary("222");
        workService.insertWork(work);
        return "0";
    }

    @PostMapping("/selectWork")
    public Work selectWork(@RequestParam("id")String id){
        Work work = workService.selectOne(id);
        return work;
    }
}
