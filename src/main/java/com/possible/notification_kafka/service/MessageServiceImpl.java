package com.possible.notification_kafka.service;

import com.possible.notification_kafka.dto.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC_KEY = "FSS";

    public MessageServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(MessageRequest request) {
        kafkaTemplate.send(TOPIC_KEY, request.message());
    }
}
