/*
 * Message Service ( @Service)
 */
package com.example.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.dto.MessageDTO;
import com.example.test.dto.UpdateMessageDTO;

@Service
public class MessageService {
    // message as a object
    private final List<MessageDTO> messages = new ArrayList<>();

    // add a message to message list
    public MessageDTO addMessage(MessageDTO msg) {
        boolean exist = messages.stream().anyMatch(m -> m.getId().equals(msg.getId()));
        if (exist)
            throw new IllegalArgumentException("Id already exists!");
        messages.add(msg);
        return msg;
    }

    // get all messages from list
    public List<MessageDTO> getAllMessage() {
        return messages;
    }

    // delete message
    public List<MessageDTO> deleteMessage(Integer id) {
        messages.removeIf(message -> message.getId() == id);
        return messages;
    }

    public List<MessageDTO> updateMessage(Integer id, UpdateMessageDTO updateData) {
        for (MessageDTO messageDTO : messages) {
            if (messageDTO.getId() == id) {
                messageDTO.setMessage(updateData.getNewMessage());
                messageDTO.setName(updateData.getNewName());
                break;
            }
        }
        return messages;
    }

}
