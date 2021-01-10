package com.antra.genshinimpact.exceptions;

import com.antra.genshinimpact.domain.Weapon;

public class WeaponException extends RuntimeException{

    private String errorMessage;

    public WeaponException(){

    }

    public WeaponException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
