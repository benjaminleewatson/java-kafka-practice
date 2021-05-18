package publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import publisher.service.PublisherService;

@RestController
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @PostMapping("/produce")
    public void produce(@RequestParam String message) {
        publisherService.produce(message);
    }

}