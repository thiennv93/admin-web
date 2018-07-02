package com.vietfintex.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDTO implements Serializable {
    private boolean success;
    private String errorCode;
    private String errorMessage;
    private Object objectReturn;

    public ResponseDTO() {
    }

    public ResponseDTO(boolean success) {
        this.success = success;
    }

    public ResponseDTO(boolean success, String errorCode) {
        this.success = success;
        this.errorCode = errorCode;
    }

    public ResponseDTO(boolean success, String errorCode, String errorMessage) {
        this.success = success;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getObjectReturn() {
        return objectReturn;
    }

    public void setObjectReturn(Object objectReturn) {
        this.objectReturn = objectReturn;
    }
}
