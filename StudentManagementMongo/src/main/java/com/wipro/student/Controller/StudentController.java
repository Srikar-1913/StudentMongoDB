package com.wipro.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.student.Service.IStudentService;
import com.wipro.student.entity.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private IStudentService stuService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return stuService.addStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		return stuService.getAllStudents();
	}
	
	@PutMapping("/upadte")
	public Student updateStudent(@RequestBody Student student) {
		return stuService.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable String studentId) {
		return stuService.deleteStudent(studentId);
	}
}
