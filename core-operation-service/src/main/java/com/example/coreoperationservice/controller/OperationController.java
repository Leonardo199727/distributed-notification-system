package com.example.coreoperationservice.controller;

import com.example.coreoperationservice.client.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/operations")
public class OperationController {

    @Autowired
    private NotificationClient notificationClient;

    @PostMapping("/inventory-event")
    public ResponseEntity<String> processInventoryEvent() {
        Map<String, String> payload = new HashMap<>();
        payload.put("recipient", "ops-manager@enterprise.com");
        payload.put("message", "System Alert: A business transaction has triggered a critical low-stock threshold event.");

        String remoteSystemResponse = notificationClient.triggerNetworkAlert(payload);

        return ResponseEntity.ok("Local operation committed successfully. Remote network response: " + remoteSystemResponse);
    }
}
