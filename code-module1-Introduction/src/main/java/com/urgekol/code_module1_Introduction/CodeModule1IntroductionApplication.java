package com.urgekol.code_module1_Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeModule1IntroductionApplication implements CommandLineRunner
{
	@Autowired
	@Qualifier("email")
	NotificationService notificationService;		// Spring creates: NotificationService notificationService = new NotificationService();


	public static void main(String[] args)
	{
		SpringApplication.run(CodeModule1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		notificationService.send("Hello World");

	}
}