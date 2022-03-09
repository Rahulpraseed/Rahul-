package com.example.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.training.model.Student;
import com.example.training.service.StudentService;

@RestController
public class StudentControler {

	@Autowired
	private StudentService service;

	@GetMapping(value = "/getAllStudents")
	public List<Student> getAllStudents() {

		List<Student> studentList = service.getAllStudent();

		return studentList;
	}

	@GetMapping(value = "/getStudent/{rollNo}")
	public List<Student> getStudentByRollNo(@PathVariable Integer rollNo) {

		List<Student> studentList = service.getStudentByRollNo(rollNo);

		return studentList;
	}

	@PostMapping(value = "/createStudent")
	public Student createStudent(@RequestBody Student stud) {

		Student student = service.createStudent(stud);

		return student;
	}

	@PutMapping(value = "/updateStudent")
	public Student updateStudent(@RequestBody Student stud) {

		Student student = service.updateStudent(stud);
		return student;

	}
	@DeleteMapping(value = "/deleteStudent/{rollNo}")
	public void deleteStudent(@PathVariable Integer rollNo) {

		 service.deleteStudent(rollNo);

	}
}
