/*Class Name  : StudentRepository
 *Description : StudentRepository class for Student
 *Date of Creation: 05/02/2022
 *Author : vn51ore
 */
package com.example.training.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.example.training.model.Student;
import com.example.training.service.StudentService;

/**
 * StudentRepository class for Student
 * 
 * @author vn51ore
 *
 */
@Repository
public class StudentRepository {

	private static Logger log = LoggerFactory.getLogger(StudentRepository.class);
	List<Student> studentList;

	/**
	 * Non argument constructor for StudentRepository
	 * 
	 */
	public StudentRepository() {
		log.info("StudentRepository constructor start");
		studentList = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setRollNo(12);
		s1.setStudentName("Rahul");
		s1.setMark(70);
		Student s2 = new Student();
		s2.setRollNo(2);
		s2.setStudentName("Shibu");
		s2.setMark(80);
		Student s3 = new Student();
		s3.setRollNo(8);
		s3.setStudentName("Anand");
		s3.setMark(90);
		Student s4 = new Student();
		s4.setRollNo(5);
		s4.setStudentName("Manu");
		s4.setMark(85);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		log.info("StudentRepository constructor end");
	}

	/**
	 * Method to getAllStudent
	 * 
	 * @return studentList
	 */
	public List<Student> getAllStudent() {
		log.info("getAllStudent methods start");
		return studentList;
	}

	/**
	 * Method to getStudent
	 * 
	 * @param rollNo
	 * @return student
	 */
	public List<Student> getStudent(int rollNo) {
		log.info("getStudent methods start with argument rollNo {}", rollNo);
		List student = studentList.stream().filter(x -> x.getRollNo() == rollNo).collect(Collectors.toList());
		log.info("getStudent methods end");
		return student;

	}

	/**
	 * Method to createStudent
	 * 
	 * @param student
	 * @return student
	 */
	public Student createStudent(Student student) {
		log.info("createStudent methods start with argument student {}", student);
		studentList.add(student);
		log.info("createStudent methods end");
		return student;
	}

	/**
	 * Method to deleteStudent
	 * 
	 * @param rollNo
	 * 
	 */
	public void deleteStudent(Integer rollNo) {
		log.info("deleteStudent methods start with argument rollNo {}", rollNo);
		studentList.remove(rollNo);
		log.info("deleteStudent methods end");
	}

	/**
	 * Method to updateStudent
	 * 
	 * @param student
	 * @return student
	 */
	public Student updateStudent(Student student) {
		log.info("updateStudent methods start with argument stud {}", student);
		for (Student stud : studentList) {
			if (stud.getRollNo() == student.getRollNo()) {
				stud.setStudentName(student.getStudentName());
				stud.setMark(student.getMark());
			}
		}
		log.info("updateStudent methods end");
		return student;

	}
}
