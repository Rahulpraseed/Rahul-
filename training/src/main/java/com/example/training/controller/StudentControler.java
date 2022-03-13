/* ********************************************************************************
 * Project Name                                  : StudentApplication
 * Author                                        : vn51ore
 *
 * Copyright Notice
 *
 * Copyright (c) 2021 Walmart. All Right Reserved.
 * This software is the confidential and proprietary information of WalMart
 * You shall not disclose or use Confidential information without the express
 * written agreement of Walmart
 *********************************************************************************/
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

import lombok.extern.slf4j.Slf4j;


/**
 * Controller class for student
 * 
 * @author vn51ore
 *
 */
@Slf4j
@RestController
public class StudentControler {


	@Autowired
	private StudentService studentService;

	/**
	 * Method to getAllStudent
	 * 
	 * @return studentList
	 */
	@GetMapping(value = "/getAllStudents")
	public List<Student> getAllStudents() {
		log.debug("getAllStudent methods start");
		List<Student> studentList = studentService.getAllStudent();
		log.debug("getAllStudent methods end");
		return studentList;
	}

	/**
	 * Method to getStudentByRollNo
	 * 
	 * @param rolNo
	 * @return studentList
	 */
	@GetMapping(value = "/getStudent/{rollNo}")
	public List<Student> getStudentByRollNo(@PathVariable Integer rollNo) {
		log.info("getStudentByRollNo methods start with argument rollNo {}", rollNo);
		List<Student> studentList = studentService.getStudentByRollNo(rollNo);
		log.debug("getStudentByRollNo methods end");
		return studentList;
	}

	/**
	 * Method to createStudent
	 * 
	 * @param student
	 * @return stud
	 */
	@PostMapping(value = "/createStudent")
	public Student createStudent(@RequestBody Student student) {
		log.info("createStudent methods start with argument stud {}", student);
		Student stud = studentService.createStudent(student);
		log.debug("createStudent methods end");
		return stud;
	}

	/**
	 * Method to updateStudent
	 * 
	 * @param student
	 * @return stud
	 */
	@PutMapping(value = "/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		log.info("updateStudent method start with argument student {}", student);
		Student stud = studentService.updateStudent(student);
		log.debug("updateStudent method end");
		return stud;

	}

	/**
	 * Method to deleteStudent
	 * 
	 * @param rollNo
	 */
	@DeleteMapping(value = "/deleteStudent/{rollNo}")
	public void deleteStudent(@PathVariable Integer rollNo) {
		log.info("deleteStudent method start with argument rollNo {}", rollNo);
		studentService.deleteStudent(rollNo);
		log.debug("deleteStudent method end");
	}
}
