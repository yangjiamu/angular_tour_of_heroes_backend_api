package com.study.springboot.service;

import com.study.springboot.model.Hero;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeroServiceTest {

    @Autowired
    private HeroService heroService;

    @Test
    public void getHeroes() {
        assertEquals(3, heroService.getHeroes().size());
    }

    @Test
    public void searchHero() {
        List<Hero> heroList = heroService.searchHero("Yang");
        assertEquals(1, heroList.size());
        assertEquals(1, heroList.get(0).getId().longValue());
    }
}