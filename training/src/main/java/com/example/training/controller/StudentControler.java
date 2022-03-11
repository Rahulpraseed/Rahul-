/*Class Name  : StudentControler
 *Description : Controller class for Student
 *Date of Creation: 05/02/2022
 *Author : vn51ore
 */
package com.example.training.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private StudentService service;

	/**
	 * Method to getAllStudent
	 * 
	 * @return studentList
	 */
	@GetMapping(value = "/getAllStudents")
	public List<Student> getAllStudents() {
		log.info("getAllStudent methods start");
		List<Student> studentList = service.getAllStudent();
		log.info("getAllStudent methods end");
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
		List<Student> studentList = service.getStudentByRollNo(rollNo);
		log.info("getStudentByRollNo methods end");
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
		Student stud = service.createStudent(student);
		log.info("createStudent methods end");
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
		Student stud = service.updateStudent(student);
		log.info("updateStudent method end");
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
		service.deleteStudent(rollNo);
		log.info("deleteStudent method end");
	}
}
