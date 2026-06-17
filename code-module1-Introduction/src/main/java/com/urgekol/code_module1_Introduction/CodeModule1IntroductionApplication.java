package com.urgekol.code_module1_Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeModule1IntroductionApplication implements CommandLineRunner
{
	@Autowired
	Payment paymentObj;		// Spring creates: Payment paymentObj = new Payment();


	public static void main(String[] args)
	{
		SpringApplication.run(CodeModule1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		paymentObj.paying();
	}
}

/*
	Why Not Call It Inside main()?
	a. main() is static.
	b. Dependency injection happens on objects.
	c. paymentObj isn't available in the static context.
*/