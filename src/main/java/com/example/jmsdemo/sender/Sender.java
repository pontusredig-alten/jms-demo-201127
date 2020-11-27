package com.example.jmsdemo.sender;

import com.example.jmsdemo.model.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {

        System.out.println("Sending message...");
        HelloMessage helloMessage = new HelloMessage("Hello from JMS demo sender!");
        jmsTemplate.convertAndSend("MY_QUEUE", helloMessage);
        System.out.println("Message sent!");

    }

}
