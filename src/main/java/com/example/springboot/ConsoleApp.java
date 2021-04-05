package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot.services.HelloService2;

@SpringBootApplication
public class ConsoleApp implements CommandLineRunner {

	@Autowired
	private HelloService2 helloService2;

	public static void main(String[] args) {
		SpringApplication.run(ConsoleApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloService2.index();
		//helloService2.addEmployee();
		//helloService2.listEmployees();

	}
		
}