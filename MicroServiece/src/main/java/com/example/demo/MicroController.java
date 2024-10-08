package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MicroController {

	RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/methodCall3")
	public String methodCall3(@RequestParam String endpoint) {
	    ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://127.0.0.1:8056/"+endpoint , String.class);
	    return responseEntity.getBody();
	}
	//show1
  
	
	@GetMapping("/methodCall32")
	public String methodCall32() {
	    ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://127.0.0.1:8082/countries", String.class);
	    return responseEntity.getBody();
	}

	@GetMapping("/hello3")
	public String hello3() {

		return "hello 3";
	}
}
