package com.ead.notification.services.impl;

import com.ead.notification.repositories.NotificationRepository;
import com.ead.notification.services.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
}
