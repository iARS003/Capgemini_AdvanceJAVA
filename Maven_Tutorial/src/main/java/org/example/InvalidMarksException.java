package org.example;

public class InvalidMarksException extends RuntimeException {

    // Constructor with message
    public InvalidMarksException(String message) {
        super(message);
    }

    // Optional: Constructor with message + cause
    public InvalidMarksException(String message, Throwable cause) {
        super(message, cause);
    }
}