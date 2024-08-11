package com.gabezy.payrollapi.exceptions;

public class UserApiClientNotFoundException extends RuntimeException {
    public UserApiClientNotFoundException() {
        super("User not found on user-api");
    }
}
