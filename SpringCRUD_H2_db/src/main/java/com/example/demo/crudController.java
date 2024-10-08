package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crudController {
	private static final Logger logger = LoggerFactory.getLogger(crudController.class);
	@Autowired
	public MyRepo myRepo;
	@Autowired
	public MyServices myService;

	@GetMapping("/test1")
	public String myString2() {
		System.out.println(" from  myString2() method ");
		return "Hello from Test  ";

	}

	@PostMapping("/insert1")
	public String InsertData(@RequestBody crudEntity crudentity) {
		myService.concatName(crudentity);
		myService.RoundUpMarks(crudentity);
		myRepo.save(crudentity);
		return "Data inserted succesfully";
	}

	@GetMapping("/showAll")
	public List<crudEntity> showAll() {
		logger.warn("this is from updateData() method ");
		return myRepo.findAll();
	}

	@GetMapping("/getById/{studentId}")
	public Optional<crudEntity> getById(@PathVariable Long studentId) {
		Optional<crudEntity> ce = myRepo.findById(studentId);
		return ce;
	}

	@PostMapping("/update/{studentId}")
	public String updateData(@PathVariable Long studentId, @RequestBody crudEntity crudentity) {
		myRepo.save(crudentity);
		logger.info("this is from updateData() method ");
		System.out.println(" data saved successfully");
		return "data saved successfully";
	}

	@PutMapping("/updateById/{studentId}")
	public String updateById(@PathVariable Long studentId, @RequestBody crudEntity crudentity) {
		myRepo.save(crudentity);
		System.out.println(" updated  successfully");
		return "updated  successfully";
	}
      
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable Long id) {
		myRepo.deleteById(id);
	}
	@PutMapping("/delete/{id}")
	public ResponseEntity<crudEntity> updateUser(@PathVariable Long id, @RequestBody crudEntity crudentity) {
		Optional<crudEntity> existingUser = myRepo.findById(id);

		if (existingUser.isPresent()) {
			crudEntity UpdatedUser = existingUser.get();
			if (crudentity.getsName() != null) {

				UpdatedUser.setsName(crudentity.getsName());
			}
			if (crudentity.getsCityName() != null) {

				UpdatedUser.setsCityName(crudentity.getsCityName());
			}
		

				UpdatedUser.setsMarks(crudentity.getsMarks());
		
		

				UpdatedUser.setStudentId(crudentity.getStudentId());
			
			myRepo.save(UpdatedUser);

			System.out.println("user  updated  successfully");
			return ResponseEntity.ok(UpdatedUser);

		} else {
			return ResponseEntity.notFound().build();
		}

	}
}
