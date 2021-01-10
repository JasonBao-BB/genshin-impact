package com.antra.genshinimpact.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
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


    public Hero(String name, Integer level, String rare, Double ap, Double dp, Account account) {
        this.name = name;
        this.level = level;
        this.rare = rare;
        this.ap = ap;
        this.dp = dp;

        this.account = account;
    }

}
