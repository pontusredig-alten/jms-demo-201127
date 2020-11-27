package com.example.jmsdemo.receiver;

import com.example.jmsdemo.model.HelloMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "MY_QUEUE")
    public void listen(@Payload HelloMessage helloMessage) {
        System.out.println("I got a message");
        System.out.println(helloMessage);
    }

}
