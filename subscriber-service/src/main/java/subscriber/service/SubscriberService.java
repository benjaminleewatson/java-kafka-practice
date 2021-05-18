package subscriber.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriberService {

    private final List<String> messages = new ArrayList<>();

    @KafkaListener(topics = "practiceTopic", groupId = "subscriber-group")
    public void listen(String message) {
        synchronized (messages) {
            messages.add(message);
        }
        System.out.println("received message: " + message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
