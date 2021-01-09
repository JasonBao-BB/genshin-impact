package com.antra.genshinimpact.service;


import com.antra.genshinimpact.domain.Weapon;

import java.util.Set;

public interface WeaponService {
    Set<Weapon> findAll();
    Weapon findById(Long id);
    void saveWeapon(Weapon weapon);
    Weapon updateWeapon(Weapon weapon);
    void deleteWeaponId(Long id);
}
