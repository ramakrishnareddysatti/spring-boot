package com.example.springboot.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

	@Value("${MY_SECRET}")
	private String s1;

	public String index() {

		//ProcessBuilder processBuilder = new ProcessBuilder();
		// Run a shell command
	    //processBuilder.command("bash", "-c", "whoami");
	    
		// Call Services Here
		for (int i = 0; i < 20; i++) {
			System.out.println("message:" + i);
			System.out.println("Foo from @Value:"+ s1);
			System.out.println("Greetings from Spring Boot!\n New IMAGE");
		}
		return "Greetings from Spring Boot!\n New IMAGE";
	}

}