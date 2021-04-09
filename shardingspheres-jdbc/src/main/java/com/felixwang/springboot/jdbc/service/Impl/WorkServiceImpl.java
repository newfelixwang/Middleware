package com.felixwang.springboot.jdbc.service.Impl;

import com.felixwang.springboot.jdbc.entity.Work;
import com.felixwang.springboot.jdbc.mapper.WorkMapper;
import com.felixwang.springboot.jdbc.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  22:09
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description
 */
@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;

    @Override
    public int insertWork(Work work) {
        return workMapper.insert(work);
    }

    @Override
    public Work selectOne(String id) {
        return workMapper.selectById(Long.parseLong(id));
    }
}
