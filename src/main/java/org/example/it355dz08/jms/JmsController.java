package org.example.it355dz08.jms;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JmsController {
    private final JmsProducer jmsProducer;

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message){
        jmsProducer.sendMessage(message);
        return message;
    }
}
