package com.nagalay.SpringWithMongodb.exception;

public class UserNotFoundException  extends Exception{


    public UserNotFoundException(String message) {
        super(message);
    }
}
