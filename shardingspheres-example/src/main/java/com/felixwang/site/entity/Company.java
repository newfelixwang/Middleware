package com.felixwang.site.entity;

import lombok.Data;

@Data
public class Company {
    private Long id;
    private String name;
    private Long ref_user_id;
    private Long user_age;
}
