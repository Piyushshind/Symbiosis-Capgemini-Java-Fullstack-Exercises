package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mySecondClass {
	@GetMapping("/abc")
    public int myInt1() {
		System.out.println(" from  myInt1() method ");
		return 100;
	}
	
	@PostMapping("/pot")
	public String myString() {
		System.out.println(" from  myString() method ");
		return "Hello from Piyush ";
	}
	
	@GetMapping("/get")
	public String myString2() {
		System.out.println(" from  myString2() method ");
		return "Hello from Piyush 2 ";
	}
	
	@PutMapping("/put")
	public String myString3() {
		System.out.println(" from  myString2() method ");
		return "Hello from Piyush 3 ";
	}
	@DeleteMapping("/del")
	public String myString4() {
		System.out.println(" from  myString2() method ");
		return "Hello from Piyush 4 ";
	}
}
