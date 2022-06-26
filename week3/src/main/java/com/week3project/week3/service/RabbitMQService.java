package com.week3project.week3.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendEmail(String email) {
        rabbitTemplate.convertAndSend("week3.email", "", email);
    }

}
