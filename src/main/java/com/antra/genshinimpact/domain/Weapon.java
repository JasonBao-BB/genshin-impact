package com.antra.genshinimpact.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wid;

    private String name;

    private Integer level;

    private String rare;

    private Double ap;

    private String talent;

    @ManyToMany(mappedBy = "weapons")
    private Set<Hero> heroes;

    public Weapon(){

    }

    public Weapon(String name, Integer level, String rare, Double ap, String talent) {
        this.name = name;
        this.level = level;
        this.rare = rare;
        this.ap = ap;
        this.talent = talent;
    }

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRare() {
        return rare;
    }

    public void setRare(String rare) {
        this.rare = rare;
    }

    public Double getAp() {
        return ap;
    }

    public void setAp(Double ap) {
        this.ap = ap;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public Set<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(Set<Hero> heroes) {
        this.heroes = heroes;
    }
}
