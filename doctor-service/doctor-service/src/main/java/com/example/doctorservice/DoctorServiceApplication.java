package com.example.doctorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorServiceApplication {

	@GetMapping("/getDS")
	public String getDoctorService() {
		return "Doctor microservice invoked...";
	}
	
	@GetMapping("/welcome/{name}") 
	public String wishing(@PathVariable String name) {
		return "Hi "+name+" welcome to the Doctor Service";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}

}
