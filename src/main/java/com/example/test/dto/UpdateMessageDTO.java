/*
 * DATA TRANSFER OBJECT
 */
package com.example.test.dto;

public class UpdateMessageDTO {
    private String newName;
    private String newMessage;

    public UpdateMessageDTO(String newName, String newMessage) {
        this.newName = newName;
        this.newMessage = newMessage;
    }

    // getter - id
    public String getNewName() {
        return newName;
    }

    // setter - id
    public void setNewname(String newName) {
        this.newName = newName;
    }

    // getter - newMessage
    public String getNewMessage() {
        return newMessage;
    }

    // setter - newMessage
    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

  
}
