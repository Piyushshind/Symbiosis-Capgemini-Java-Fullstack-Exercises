package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyServices {
 
	public crudEntity concatName (crudEntity crudentity) {
		crudentity.setsName("Mr " + crudentity.getsName());
		
	 return crudentity;	
	}
	
	public crudEntity RoundUpMarks (crudEntity crudentity) {
		int marks = crudentity.getsMarks();
		if(marks <40 && marks >35) {
			crudentity.setsMarks(40);
		}
		
	 return crudentity;	
	}
}
