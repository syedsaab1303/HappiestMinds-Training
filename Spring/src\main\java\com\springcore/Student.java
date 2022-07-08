package com.springcore;

public class Student {
 private int studentId; //This studentId(refrence variable) should match the name in the properties of config.xml otherwise we doesn't get answer
 private String studentName;
 private String studentAddress;
 // setter injection
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	System.out.println(" This is setter injection ");
	System.out.println("Setting Student Id");
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	System.out.println("Setting Student Name");
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	System.out.println("Setting Student Address");
	this.studentAddress = studentAddress;
}
public Student(int studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}


@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
 







}
