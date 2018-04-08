package com.study.springboot.repository;

import com.study.springboot.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wenjie yang on 2018/4/4.
 */
@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer>{

    public List<Hero> findByName(String name);
}
