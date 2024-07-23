package com.learn.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	IStudentService studentSvc;
	
	//crud operations
	@PostMapping(value="/students" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public String save(@RequestBody final Student student) {
		final boolean response = studentSvc.save(student);
		return response ? "student record saved successfully" : "error in saving student record";
	}
	
	@GetMapping(value="/students/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Student fetch(@PathVariable(name = "id" ) final int id) {
		final Student response = studentSvc.fetch(id);
		return response;
	}
	
	@DeleteMapping(value="/students/{id}")
	public boolean delete(@PathVariable(name = "id" ) final int id) {
		final boolean isDeleted = studentSvc.delete(id);
		return isDeleted;
	}
	
	
	@PutMapping(value="/students" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean fetch(@RequestBody final Student student) {
		final boolean isUpdated = studentSvc.update(student);
		return isUpdated;
	}
}
