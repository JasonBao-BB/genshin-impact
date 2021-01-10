package com.antra.genshinimpact.exceptions;

public class AccountException extends RuntimeException{

    private String errorMessage;

    public AccountException(){};

    public AccountException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
