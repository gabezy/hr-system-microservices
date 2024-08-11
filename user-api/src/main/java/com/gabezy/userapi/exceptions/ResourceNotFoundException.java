package com.gabezy.userapi.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Resource not found");
    }

}
