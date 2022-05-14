package com.ead.notification.repositories;

import com.ead.notification.enums.NotificationStatus;
import com.ead.notification.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface NotificationRepository extends JpaRepository<NotificationModel, UUID> {

    Page<NotificationModel> findAllByUserIdAndStatus(UUID userId, NotificationStatus status, Pageable pageable);
    Optional<NotificationModel> findByIdAndUserId(UUID id, UUID userId);
}
