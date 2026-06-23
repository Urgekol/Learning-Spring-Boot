package com.urgekol.code_module1_Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class CodeModule1IntroductionApplication implements CommandLineRunner
{
	@Autowired
    Map<String, NotificationService> notificationServices = new HashMap<>();

	public static void main(String[] args)
	{
		SpringApplication.run(CodeModule1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		notificationServices.forEach(
				(key, value) ->
				{
					System.out.print(key + "-->");
					System.out.println(value.getClass().getSimpleName());
				}
		);
	}
}

/*
	Why not HashMap used instead of Map?

	~ We use "Map" instead of "HashMap" because it promotes loose coupling,
	  follows the "Dependency Inversion Principle", provides flexibility
	  to change implementations, and aligns with Spring's dependency
	  injection philosophy of programming to interfaces rather than
	  implementations.
*/