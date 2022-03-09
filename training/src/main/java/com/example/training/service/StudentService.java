package com.example.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.training.model.Student;
import com.example.training.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	public List<Student> getAllStudent() {

		List student = repo.getAllStudent();

		return student;
	}

	public List<Student> getStudentByRollNo(Integer rolNo) {

		List<Student> stud = repo.getStudent(rolNo);

		return stud;
	}

	public Student createStudent(Student stud) {

		Student student = repo.createStudent(stud);

		return student;
	}

	public void deleteStudent(Integer rollNo) {
		repo.deleteStudent(rollNo);
	}

	public Student updateStudent(Student stud) {

		Student student = repo.updateStudent(stud);
		return student;
		
	}

}
