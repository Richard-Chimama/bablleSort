package org.example;

public class NonStringElementInCollectionException extends RuntimeException{
    public NonStringElementInCollectionException(String message, Throwable cause){
        super(message, cause);
    }
}
