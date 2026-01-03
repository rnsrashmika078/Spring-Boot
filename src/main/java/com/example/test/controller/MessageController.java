/*
 * Message Controller class 
 */
package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.dto.MessageDTO;
import com.example.test.dto.UpdateMessageDTO;
import com.example.test.service.MessageService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    // convert JSON data to MessageDTO -> FRONTEND (JSON ) -> BE ( MESSAGE DTO )
    @PostMapping
    public MessageDTO postMessage(@Valid @RequestBody MessageDTO msg) {
        return messageService.addMessage(msg);
    }

    @GetMapping
    public List<MessageDTO> getMessage() {
        return messageService.getAllMessage();
    }

    @DeleteMapping("/{id}")
    public List<MessageDTO> deleteMessage(@Valid @PathVariable Integer id) {
        return messageService.deleteMessage(id);

    }

    @PutMapping("/{id}")
    public List<MessageDTO> updateMessage(@Valid @PathVariable Integer id,
            @RequestBody UpdateMessageDTO updateMessageDTO) {
        System.out.println("Received message: " + updateMessageDTO.getNewMessage());
        return messageService.updateMessage(id, updateMessageDTO);
    }

}
