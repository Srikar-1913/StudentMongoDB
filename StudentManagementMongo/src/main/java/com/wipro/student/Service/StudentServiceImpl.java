package com.wipro.student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.student.Repository.IStudentRepository;
import com.wipro.student.entity.Student;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentRepository stuRepo;
	
	@Override
	public Student addStudent(Student student) {
		
		return stuRepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {

		return stuRepo.findAll();
	}

	@Override
	public Student updateStudent(Student student) {

		return stuRepo.save(student);
	}

	@Override
	public String deleteStudent(String studentId) {
		stuRepo.deleteById(studentId);
		return "Student deleted Sucessfully";
	}

}
