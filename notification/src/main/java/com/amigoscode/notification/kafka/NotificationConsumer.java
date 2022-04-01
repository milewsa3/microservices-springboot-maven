package com.amigoscode.notification.kafka;

import com.amigoscode.clients.notification.NotificationRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "amigoscode", groupId = "groupId", containerFactory = "messageFactory")
    public void consumer(NotificationRequest request) {
        System.out.println("Listener received: " + request + " ❤️");
    }

}
