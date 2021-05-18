package publisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    @Autowired
    private KafkaTemplate<String, String> template;

    public void produce(String message) {
        template.send("practiceTopic", message);
        System.out.println("sending message: " + message);
    }
}
