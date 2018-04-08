package com.study.springboot.controller;

import com.study.springboot.model.Hero;
import com.study.springboot.service.HeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wenjie yang on 2018/4/4.
 */
@RestController()
public class HeroController {

    private static final Logger logger = LoggerFactory.getLogger(HeroController.class);

    @Autowired
    private HeroService heroService;

    @GetMapping("/api/heroes")
    public List<Hero> heroes(){
        logger.info("get heroes");
        return heroService.getHeroes();
    }

    @GetMapping(value = "/api/heroes/{id}")
    public Hero hero(@PathVariable("id") Integer id){
        logger.info("get hero{}", id);
        return heroService.getHero(id);
    }

    @PostMapping(value = "/api/heroes")
    public Hero heroAdd(@RequestBody Hero hero){
        logger.info("add hero{}", hero);
        return heroService.addHero(hero);
    }

    @PutMapping(value = "/api/heroes")
    public Hero heroUpdate(@RequestBody Hero hero){
        logger.info("update hero{}", hero);
        return heroService.updateHero(hero);
    }

    @DeleteMapping(value = "/api/heroes/{id}")
    public void heroDelete(@PathVariable("id") Integer id){
        logger.info("delete hero{}", id);
        heroService.deleteHero(id);
    }

    @GetMapping(value = "/api/heroes", params = "name")
    public List<Hero> heroSearch(@RequestParam(required = true) String name){
        logger.info("search hero by name {}", name);
        return heroService.searchHero(name);
    }
}
