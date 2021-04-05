package com.example.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springboot.database.Employee;
import com.example.springboot.database.EmployeeRepository;

@Component
public class HelloService2 {
	@Value("${app.secret}")
	private  String appSecret;
	
	@Value("${app.message}")
	private  String appMessage;

    @Autowired
    private EmployeeRepository employeeRepository;
	
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
	
	public void addEmployee() {
		
		Employee employee = new Employee();
		employee.setEmpName("Ramakrishna");
		employee.setEmpContact("1234567890");
		employeeRepository.save(employee);
	}
	
	public void listEmployees() {
		
		List<Employee> employees = employeeRepository.findAll();
		System.out.println(employees.toString());
		
	}

}