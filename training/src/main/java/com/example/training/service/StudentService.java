/*Class Name  : StudentService
 *Description : Service class for Student
 *Date of Creation: 05/02/2022
 *Author : vn51ore
 */
package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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

@Service
public class StudentService {

	private static Logger log = LoggerFactory.getLogger(StudentService.class);
	@Autowired
	private StudentRepository repo;

	/**
	 * Method to getAllStudent
	 * 
	 * @return student
	 */
	public List<Student> getAllStudent() {
		log.info("getAllStudent methods start");
		List student = repo.getAllStudent();

		log.info("getAllStudent methods end");
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
		List<Student> stud = repo.getStudent(rolNo);
		log.info("getStudentByRollNo methods end");
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
		Student stud = repo.createStudent(student);
		log.info("createStudent method end");
		return stud;
	}

	/**
	 * Method to deleteStudent
	 * 
	 * @param rollNo
	 */
	public void deleteStudent(Integer rollNo) {
		log.info("deleteStudent method with argument rollNo {}", rollNo);
		repo.deleteStudent(rollNo);
		log.info("deleteStudent method end");
	}

	/**
	 * Method to updateStudent
	 * 
	 * @param student
	 * @return stud
	 */
	public Student updateStudent(Student student) {
		log.info("updateStudent method start with argument stud {}", student);
		Student stud = repo.updateStudent(student);
		log.info("updateStudent method end");
		return stud;

	}

}
