package com.amigoscode.notification;

import org.springframework.data.jpa.repository.JpaRepository;

interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
