/*Class Name  : Student
 *Description : Model class for Student
 *Date of Creation: 05/02/2022
 *Author : vn51ore
 */
package com.example.training.model;

/**
 * Model class for Student
 * 
 * @author vn51ore
 *
 */
public class Student {

	private Integer rollNo;
	private String studentName;
	private Integer mark;

	/**
	 * Argument constructor for Student
	 * 
	 */
	public Student(Integer rollNo, String studentName, Integer mark) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.mark = mark;
	}

	/**
	 * Non argument constructor for Student
	 * 
	 */
	public Student() {
	}

	/*
	 * Accessor Method for getRollNo
	 */
	public Integer getRollNo() {
		return rollNo;
	}

	/*
	 * Accessor Method for setRollNo
	 */
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	/*
	 * Accessor Method for getStudentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/*
	 * Accessor Method for getStudentName
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/*
	 * Accessor Method for getMark
	 */
	public Integer getMark() {
		return mark;
	}

	/*
	 * Accessor Method for setMark
	 */
	public void setMark(Integer mark) {
		this.mark = mark;
	}

}
