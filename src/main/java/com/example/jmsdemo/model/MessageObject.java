package com.example.jmsdemo.model;

import java.io.Serializable;
import java.util.UUID;

public class MessageObject implements Serializable {

    private UUID id;
    private String message;

    public MessageObject(UUID id, String message) {
        this.id = id;
        this.message = message;
    }

    public MessageObject() {
    }

    public UUID getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MessageObject{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
