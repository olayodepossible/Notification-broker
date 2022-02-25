package com.possible.notification_kafka.service;

import com.possible.notification_kafka.dto.MessageRequest;

public interface MessageService {

    void sendMessage(MessageRequest request);
}
