package com.antra.genshinimpact.exceptions;

public class ErrorResponse {

    private Integer errorCode;
    private String errorMessage;

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}
