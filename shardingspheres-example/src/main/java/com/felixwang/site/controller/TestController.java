package com.felixwang.site.controller;

import com.felixwang.site.entity.Company;
import com.felixwang.site.entity.User;
import com.felixwang.site.mapper.CompanyMapper;
import com.felixwang.site.mapper.UserMapper;
import com.felixwang.site.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  17:25
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description
 */
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CompanyMapper companyMapper;


    SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0,0);

    SnowflakeIdWorker companySnowflakeIdWorker = new SnowflakeIdWorker(0,0);
    @GetMapping("insert")
    public String insert(){
        for (int i=0 ;i<100; i++){
            Random random = new Random();
            User user = new User();
            user.setId(idWorker.nextId());
            //取得100以内的正整数
            user.setAge((long)random.nextInt(100)+1);
            user.setName("test");
        //    user.setCompany_name("company");

            userMapper.insert(user);

            Company company = new Company();
//            company.setId((long)i);
            company.setId(companySnowflakeIdWorker.nextId());
            company.setName("公司"+ UUID.randomUUID().toString());
            company.setRef_user_id(user.getId());
            company.setUser_age(user.getAge());
            companyMapper.insert(company);
        }
        return "insert";
    }


}
