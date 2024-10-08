package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;

	RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/showAllStudents")
	public List<StudentEntity> showAllStudents() {
		return studentRepo.findAll();
	}

	@GetMapping("/hello2")
	public String hello2() {
		return "hello piyush ";
	}

	@GetMapping("/countries")
	public List<Object> getContries() {
		String url = "https://fakestoreapi.com/products";

		Object[] countries = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(countries);
	}

	@GetMapping("/methodCall2")
	public String methodCall() {
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://127.0.0.1:8056/all3&quot",
				String.class);

		return responseEntity.getBody();
	}

} 
