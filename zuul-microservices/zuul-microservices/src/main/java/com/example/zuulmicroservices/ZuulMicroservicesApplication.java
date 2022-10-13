package com.example.zuulmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZuulMicroservicesApplication {
	
	@GetMapping("/getDiagnosis")
	public String getDiagnosisService() {
		return "Diagnosis microservice invoked...";
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulMicroservicesApplication.class, args);
	}

}
