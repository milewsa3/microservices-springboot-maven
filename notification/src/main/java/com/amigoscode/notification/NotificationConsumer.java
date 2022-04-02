package com.amigoscode.notification;

import com.amigoscode.clients.notification.NotificationRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
class NotificationConsumer {

    NotificationService notificationService;

    @KafkaListener(topics = "amigoscode", groupId = "groupId", containerFactory = "messageFactory")
    void consumer(NotificationRequest request) {
        log.info("Consumed {} from queue", request);
        notificationService.send(request);
    }

}
