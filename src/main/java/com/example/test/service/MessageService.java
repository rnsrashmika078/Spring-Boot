/*
 * Message Service ( @Service)
 */
package com.example.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.dto.MessageDTO;

@Service
public class MessageService {
    // message as a object
    private final List<MessageDTO> messages = new ArrayList<>();

    // add a message to message list
    public MessageDTO addMessage(MessageDTO msg) {
        messages.add(msg);
        return msg;
    }

    // get all messages from list
    public List<MessageDTO> getAllMessage() {
        return messages;
    }

}
