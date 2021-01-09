package com.antra.genshinimpact.service;


import com.antra.genshinimpact.domain.Hero;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HeroServiceImpl implements HeroService{
    @Override
    public Set<Hero> findAll() {
        return null;
    }

    @Override
    public Hero findById(Long id) {
        return null;
    }

    @Override
    public void saveHero(Hero hero) {

    }

    @Override
    public Hero updateHero(Hero hero) {
        return null;
    }

    @Override
    public void deleteHeroById(Long id) {

    }
}
