/*
 * DATA TRANSFER OBJECT
 */
package com.example.test.dto;

public class MessageDTO {
    private String name;
    private String message;

    public MessageDTO(String name, String message) {
        this.name = name;
        this.message = message;
    }

    // getter - name
    public String getName() {
        return name;
    }

    // setter - name
    public void setName(String name) {
        this.name = name;
    }

    // getter - message
    public String getMessage() {
        return message;
    }

    // setter - message
    public void setMessage(String message){
        this.message = message;
    }

}
