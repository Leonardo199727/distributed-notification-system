package com.example.notificationservice.controller;

import com.example.notificationservice.dto.NotificationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    @PostMapping
    public ResponseEntity<String> dispatchNotification(@RequestBody NotificationRequest request) {
        System.out.println("⚠️ DISTRIBUTED ALERT DISPATCHED TO [" + request.getRecipient() + "]: " + request.getMessage());
        return ResponseEntity.ok("Notification successfully routed through the distributed network.");
    }
}
