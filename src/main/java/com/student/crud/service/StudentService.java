package com.student.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.crud.entity.Student;
import com.student.crud.repository.StudentRepository;

/**
 * @author mindc1july10
 *
 */
@Service
public class StudentService {
	
    @Autowired
	private StudentRepository repository;
    
    public Student saveStudent(Student student) {
    	return repository.save(student);
    }
    public List<Student> saveStudents(List<Student> students) {
    	return repository.saveAll(students);
    }
    
    public List<Student> getStudents(){
    	return repository.findAll();
    }
    
    
    public Student getStudentById(int id){
    	return repository.findById(id).orElse(null);
    }
    
    public Student getStudentByName(String name){
    	return repository.findByName(name);
    }
    
	
}
