package org.example.it355dz08.jms;
import org.example.it355dz08.entity.MessageEntity;
import org.example.it355dz08.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class JmsListener {
    @Autowired
    private MessageRepository messageRepository;

    @org.springframework.jms.annotation.JmsListener(destination = "test")
    public void listener(String message) {
        System.out.println("Pristigla poruka je " + message);
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setMessage(message);
        messageEntity.setTimestamp(LocalDateTime.now());
        messageRepository.save(messageEntity);
    }
}