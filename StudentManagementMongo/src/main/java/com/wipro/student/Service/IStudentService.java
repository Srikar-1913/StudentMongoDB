package com.wipro.student.Service;

import java.util.List;

import com.wipro.student.entity.Student;

public interface IStudentService {
	Student addStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student updateStudent(Student student);
	
	String deleteStudent(String studentId);
}
