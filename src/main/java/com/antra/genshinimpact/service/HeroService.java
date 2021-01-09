package com.antra.genshinimpact.service;



import com.antra.genshinimpact.domain.Hero;

import java.util.Set;

public interface HeroService {
    Set<Hero> findAll();
    Hero findById(Long id);
    void saveHero(Hero hero);
    Hero updateHero(Hero hero);
    void deleteHeroById(Long id);
}
