package com.jwt.demo.exception;

import lombok.Data;

@Data
public class UserException extends RuntimeException{

    private String message;

    public UserException(String message) {
        super(message);
        this.message = message;
    }
}
