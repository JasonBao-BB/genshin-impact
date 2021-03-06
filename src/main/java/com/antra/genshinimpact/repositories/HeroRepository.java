package com.antra.genshinimpact.repositories;


import com.antra.genshinimpact.domain.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Long>  {
}
