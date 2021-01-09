package com.antra.genshinimpact.repositories;


import com.antra.genshinimpact.domain.Weapon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends CrudRepository<Weapon, Long>  {
}
