package com.antra.genshinimpact.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String name;

    private Integer level;

    private String description;

    private String birth;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "account")
    private Set<Hero> heroSet = new HashSet<>();


    public Account(String name, Integer level, String description, String birth) {
        this.name = name;
        this.level = level;
        this.description = description;
        this.birth = birth;
    }
}
