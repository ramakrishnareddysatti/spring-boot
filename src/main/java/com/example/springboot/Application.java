package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springboot.services.HelloService;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		String str = context.getEnvironment().getProperty("MY_SECRET");
		System.out.println("=>>>> " + str);
		
		HelloService helloService = new HelloService();
		helloService.index();
		
		System.exit(SpringApplication.exit(context, () -> 0));
	}

}
