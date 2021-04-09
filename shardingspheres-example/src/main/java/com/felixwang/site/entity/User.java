package com.felixwang.site.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    private Date create_time;
    private Long age;




}
