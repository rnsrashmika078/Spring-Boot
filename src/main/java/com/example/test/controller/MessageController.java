/*
 * Message Controller class 
 */
package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.dto.MessageDTO;
import com.example.test.service.MessageService;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    // convert JSON data to MessageDTO -> FRONTEND (JSON ) -> BE ( MESSAGE DTO )
    @PostMapping
    public MessageDTO postMessage(@RequestBody MessageDTO msg) {
        return messageService.addMessage(msg);
    }

    @GetMapping
    public List<MessageDTO> getMessage() {
        return messageService.getAllMessage();
    }

}
