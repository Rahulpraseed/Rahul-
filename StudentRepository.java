package com.example.training.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.training.model.Student;

@Repository
public class StudentRepository {

	List<Student> studentList;

	public StudentRepository() {

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

	}

	public List<Student> getAllStudent() {

		return studentList;
	}

	public List<Student> getStudent(int rollNo) {

		List stud = studentList.stream().filter(x -> x.getRollNo() == rollNo).collect(Collectors.toList());

		return stud;

	}

	public Student createStudent(Student stud) {

		studentList.add(stud);

		return stud;
	}

	public void deleteStudent(Integer rollNo) {
		studentList.remove(rollNo);
	}

	public Student updateStudent(Student stud) {
		for (Student student : studentList) {
			if (student.getRollNo() == stud.getRollNo()) {

				student.setStudentName(stud.getStudentName());
				student.setMark(stud.getMark());

			}
		}
		return stud;

	}
}
