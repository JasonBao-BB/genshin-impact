package com.antra.genshinimpact.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hid;

    private String name;

    private Integer level;

    private String rare;

    private Double ap;

    private Double dp;

    @ManyToOne
    private Account account;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "hero_weapon", joinColumns = @JoinColumn(name = "hid"),
            inverseJoinColumns = @JoinColumn(name = "wid"))
    private Set<Weapon> weapons = new HashSet<>();

    public Hero(){

    }

    public Hero(String name, Integer level, String rare, Double ap, Double dp, Account account) {
        this.name = name;
        this.level = level;
        this.rare = rare;
        this.ap = ap;
        this.dp = dp;

        this.account = account;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
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

    public Double getDp() {
        return dp;
    }

    public void setDp(Double dp) {
        this.dp = dp;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Set<Weapon> weapons) {
        this.weapons = weapons;
    }
}
