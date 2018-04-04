package com.study.springboot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wenjie yang on 2018/4/4.
 */
@Data
@Entity
public class Hero {
    public Hero() {
    }

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

}
