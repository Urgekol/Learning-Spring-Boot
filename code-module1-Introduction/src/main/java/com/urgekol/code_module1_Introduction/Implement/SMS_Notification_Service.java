package com.urgekol.code_module1_Introduction.Implement;

import com.urgekol.code_module1_Introduction.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
public class SMS_Notification_Service
        implements NotificationService
{
    @Override
    public void send(String message)
    {
        System.out.println(
                "SMS sending.... " + message
        );
    }
}