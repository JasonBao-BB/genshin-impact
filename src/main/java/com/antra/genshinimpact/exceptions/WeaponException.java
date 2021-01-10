package com.antra.genshinimpact.exceptions;

import com.antra.genshinimpact.domain.Weapon;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WeaponException extends RuntimeException{

    private String errorMessage;


    public WeaponException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

}
