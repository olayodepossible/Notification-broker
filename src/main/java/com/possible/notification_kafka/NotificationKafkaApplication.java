package com.possible.notification_kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class NotificationKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationKafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> kafkaTemplate.send("FSS", "Testing Testing Hello");
    }

}
