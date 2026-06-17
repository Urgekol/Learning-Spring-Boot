package com.urgekol.code_module1_Introduction.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String home()
    {
        System.out.println("HomeController mapping is active");

        System.out.println("Application name is "+appName);
        return "index";
    }
}


/*
    Must use the dependency:
    
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
*/