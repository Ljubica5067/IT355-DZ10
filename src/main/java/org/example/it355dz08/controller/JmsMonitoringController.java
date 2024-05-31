package org.example.it355dz08.controller;

import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.MessageEntity;
import org.example.it355dz08.repository.MessageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JmsMonitoringController {
    private final MessageRepository messageRepository;

    @GetMapping("/messages")
    public List<MessageEntity> getAllMessages() {
        return messageRepository.findAll();
    }
}
