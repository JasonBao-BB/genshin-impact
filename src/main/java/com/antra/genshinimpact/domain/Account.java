package com.antra.genshinimpact.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String name;

    private Integer level;

    private String description;

    private String birth;

    @OneToMany(mappedBy = "account")
    private Set<Hero> heroSet;

    public Account(){

    }

    public Account(String name, Integer level, String description, String birth) {
        this.name = name;
        this.level = level;
        this.description = description;
        this.birth = birth;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String rare) {
        this.description = rare;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Set<Hero> getHeroSet() {
        return heroSet;
    }

    public void setHeroSet(Set<Hero> heroSet) {
        this.heroSet = heroSet;
    }
}
