/*
 * package com.example.springboot.services;
 * 
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.stereotype.Component;
 * 
 * @Component
 * 
 * @Configuration
 * 
 * @EnableAutoConfiguration public class HelloService {
 * 
 * @Value("${MY_SECRET}") private String s1;
 * 
 * 
 * 
 * static public void setDatabase(String db) { s1 = db; }
 * 
 * 
 * public String index() {
 * 
 * //ProcessBuilder processBuilder = new ProcessBuilder(); // Run a shell
 * command //processBuilder.command("bash", "-c", "whoami");
 * 
 * // Call Services Here for (int i = 0; i < 20; i++) {
 * System.out.println("message:" + i); System.out.println("MY_SECRET:"+ s1);
 * System.out.println("Greetings from Spring Boot! New IMAGE"); } return
 * "Greetings from Spring Boot!\n New IMAGE"; }
 * 
 * }
 */