package com.student.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.crud.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	Student findByName(String name);

}
