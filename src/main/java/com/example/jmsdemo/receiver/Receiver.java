package com.example.jmsdemo.receiver;

import com.example.jmsdemo.config.JmsConfig;
import com.example.jmsdemo.model.MessageObject;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = JmsConfig.JU19_QUEUE)
    public void listen(@Payload MessageObject messageObject) {
        System.out.println("I got a message");
        System.out.println(messageObject);
    }

}
