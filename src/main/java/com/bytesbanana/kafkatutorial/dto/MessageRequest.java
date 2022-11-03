package com.bytesbanana.kafkatutorial.dto;


public class MessageRequest {
    private String message;

    @Override
    public String toString() {
        return "MessageRequest{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
