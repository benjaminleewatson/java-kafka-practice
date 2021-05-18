package subscriber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import subscriber.service.SubscriberService;

import java.util.List;

@RestController
public class SubscriberController {

    @Autowired
    SubscriberService subscriberService;

    @RequestMapping("/consume")
    public List<String> consume() {
        return subscriberService.getMessages();
    }

}