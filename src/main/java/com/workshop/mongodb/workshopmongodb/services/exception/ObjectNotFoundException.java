package com.workshop.mongodb.workshopmongodb.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

}