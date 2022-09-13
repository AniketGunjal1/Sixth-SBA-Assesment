package com.student.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.crud.entity.Student;
import com.student.crud.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service ;
	
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		
		return service.saveStudent(student);
	}
	
	@PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody List<Student> students) {
		
		return service.saveStudents(students);
	}
	@GetMapping("/Student")
	public List<Student> findAllStudents(){
    	return service.getStudents();
    }
	
	
	@GetMapping("/Student/{id}")
	public Student findStudentById(@PathVariable int id) {
		
		return service.getStudentById(id);
	}
	
	
	@GetMapping("/Product/{name}")
	public Student findStudentByName(@PathVariable String name) {
		
		return service.getStudentByName(name);
	}


}
