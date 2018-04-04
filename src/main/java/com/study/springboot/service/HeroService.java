package com.study.springboot.service;

import com.study.springboot.model.Hero;
import com.study.springboot.repository.HeroRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

/**
 * Created by wenjie yang on 2018/4/4.
 */
@Service
public class HeroService {

    private static final Logger logger = LoggerFactory.getLogger(HeroService.class);

    @Autowired
    private HeroRepository heroRepository;

    public List<Hero> getHeroes(){
        return heroRepository.findAll();
    }

    public Hero getHero(Integer id){
        Optional<Hero> heroOptional = heroRepository.findById(id);
        return heroOptional.isPresent() ? heroOptional.get(): null;
    }

    public Hero addHero(Integer id, String name){
        Hero hero = new Hero();
        hero.setId(id);
        hero.setName(name);
        return heroRepository.save(hero);
    }

    public Hero addHero(Hero hero){
        return heroRepository.save(hero);
    }

    public Hero updateHero(Integer id, String name){
        Hero hero = new Hero();
        hero.setId(id);
        hero.setName(name);
        return heroRepository.save(hero);
    }

    public Hero updateHero(Hero hero){
        return heroRepository.save(hero);
    }

    public void deleteHero(Hero hero){
        heroRepository.delete(hero);
    }

    public void deleteHero(Integer id){
        heroRepository.deleteById(id);
    }
}
