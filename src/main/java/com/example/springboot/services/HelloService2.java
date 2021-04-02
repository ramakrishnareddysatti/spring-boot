package com.example.springboot.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloService2 {
	@Value("${HELLO}")
	private  String s1;

    
	/*
	 * static
	 * public void setDatabase(String db) { s1 = db; }
	 */

	public void index() {

		//ProcessBuilder processBuilder = new ProcessBuilder();
		// Run a shell command
	    //processBuilder.command("bash", "-c", "whoami");
	    
		// Call Services Here
		for (int i = 0; i < 20; i++) {
			System.out.println("message:" + i);
			System.out.println("MY_SECRET:"+ s1);
			System.out.println("Greetings from Spring Boot! New IMAGE");
		}
		//return "Greetings from Spring Boot END";
	}

}