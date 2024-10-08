package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class MyRestBeen {


	@Bean
	@LoadBalanced
	 public RestTemplate MyRestBeenStudent() {
		 return new RestTemplate();
	 }
}
