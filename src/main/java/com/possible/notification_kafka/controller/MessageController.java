package com.possible.notification_kafka.controller;

import com.possible.notification_kafka.dto.MessageRequest;
import com.possible.notification_kafka.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public void publishMessages(@RequestBody MessageRequest request){
        messageService.sendMessage(request);

    }
}
