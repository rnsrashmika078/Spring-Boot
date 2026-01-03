/*
 * DATA TRANSFER OBJECT
 */
package com.example.test.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MessageDTO {

    @NotNull(message = "Id is required")
    private Integer id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Message is required")
    private String message;

    public MessageDTO(Integer id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    // getter - id
    public Integer getId() {
        return id;
    }

    // setter - id
    public void setId(Integer id) {
        this.id = id;
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
    public void setMessage(String message) {
        this.message = message;
    }

}
