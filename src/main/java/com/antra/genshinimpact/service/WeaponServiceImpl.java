package com.antra.genshinimpact.service;

import com.antra.genshinimpact.domain.Weapon;
import com.antra.genshinimpact.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class WeaponServiceImpl implements WeaponService{

    private WeaponRepository repository;

    @Autowired
    public WeaponServiceImpl(WeaponRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Weapon> findAll() {
        Set<Weapon> weapons = new HashSet<>();
        repository.findAll().forEach(weapons::add);
        return weapons;
    }

    @Override
    public Weapon findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void saveWeapon(Weapon weapon) {
        repository.save(weapon);
    }

    @Override
    public Weapon updateWeapon(Weapon weapon) {
        return repository.save(weapon);
    }

    @Override
    public void deleteWeaponId(Long id) {
        repository.deleteById(id);
    }
}
