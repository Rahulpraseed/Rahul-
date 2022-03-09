package com.example.training.model;

public class Student {

	private Integer rollNo;
	private String studentName;
	private Integer mark;

	public Student(Integer rollNo, String studentName, Integer mark) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.mark = mark;
	}

	public Student() {
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

}
