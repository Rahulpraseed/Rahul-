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
package com.example.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.training.model.Student;
import com.example.training.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * Service class for Student
 * 
 * @author vn51ore
 *
 */
@Slf4j
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	/**
	 * Method to getAllStudent
	 * 
	 * @return student
	 */
	public List<Student> getAllStudent() {
		log.debug("getAllStudent methods start");
		List student = studentRepo.getAllStudent();

		log.debug("getAllStudent methods end");
		return student;
	}

	/**
	 * Method to getStudentByRollNo
	 * 
	 * @param rolNo
	 * @return stud
	 */
	public List<Student> getStudentByRollNo(Integer rolNo) {
		log.info("getStudentByRollNo methods start with argument rollNo {}", rolNo);
		List<Student> stud = studentRepo.getStudent(rolNo);
		log.debug("getStudentByRollNo methods end");
		return stud;
	}

	/**
	 * Method to createStudent
	 * 
	 * @param student
	 * @return stud
	 */
	public Student createStudent(Student student) {
		log.info("createStudent method start with argument stud {}", student);
		Student stud = studentRepo.createStudent(student);
		log.debug("createStudent method end");
		return stud;
	}

	/**
	 * Method to deleteStudent
	 * 
	 * @param rollNo
	 */
	public void deleteStudent(Integer rollNo) {
		log.info("deleteStudent method with argument rollNo {}", rollNo);
		studentRepo.deleteStudent(rollNo);
		log.debug("deleteStudent method end");
	}

	/**
	 * Method to updateStudent
	 * 
	 * @param student
	 * @return stud
	 */
	public Student updateStudent(Student student) {
		log.info("updateStudent method start with argument stud {}", student);
		Student stud = studentRepo.updateStudent(student);
		log.debug("updateStudent method end");
		return stud;

	}

}
