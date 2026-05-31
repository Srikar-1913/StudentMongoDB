package com.wipro.student.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.student.entity.Student;

public interface IStudentRepository extends MongoRepository<Student, String>{
	
}
