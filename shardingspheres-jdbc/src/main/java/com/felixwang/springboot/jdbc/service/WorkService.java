package com.felixwang.springboot.jdbc.service;

import com.felixwang.springboot.jdbc.entity.Work;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  22:09
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description
 */
public interface WorkService {

   int insertWork(Work work);

   Work selectOne(String id);

}
