package com.urgekol.code_module1_Introduction.Implement;

import com.urgekol.code_module1_Introduction.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("email")
public class Email_Notification_Service implements NotificationService
{
    @Override
    public void send(String message)
    {
        System.out.println("Email sending...." + message);
    }
}