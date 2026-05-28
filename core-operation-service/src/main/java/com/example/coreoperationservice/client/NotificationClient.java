package com.example.coreoperationservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification-service")
public interface NotificationClient {
    @PostMapping("/api/v1/notifications")
    String triggerNetworkAlert(@RequestBody Object notificationPayload);
}
