package com.commendare.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @MessageMapping("/notification")
    @SendTo("/topic/general")
    public NotificationMessage notify(NotificationMessage message) throws Exception{
        //TODO: remove, just for simulating delay
        System.out.println(message.name);
        Thread.sleep(2000);
        return message;
    }

}
