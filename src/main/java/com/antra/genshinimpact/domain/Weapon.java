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
    private Set<Hero> heroes= new HashSet<>();


    public Weapon(String name, Integer level, String rare, Double ap, String talent) {
        this.name = name;
        this.level = level;
        this.rare = rare;
        this.ap = ap;
        this.talent = talent;
    }

}
