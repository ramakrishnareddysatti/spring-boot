package com.example.springboot.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloService2 {
	@Value("${app.secret}")
	private  String appSecret;
	
	@Value("${app.message}")
	private  String appMessage;

    
	/*
	 * static
	 * public void setDatabase(String db) { s1 = db; }
	 */

	public void index() {

		//ProcessBuilder processBuilder = new ProcessBuilder();
		// Run a shell command
	    //processBuilder.command("bash", "-c", "whoami");
	    
		// Call Services Here
			System.out.println("MY_SECRET:"+ appSecret);
			System.out.println("MESSAGE:" + appMessage);
		//return "Greetings from Spring Boot END";
	}

}