package com.tmf.spro.backend.model;

public class Student {
	private int studentId;
	private String studentName, studentEmail;
	private int x = 20;
	
	//No parameterized Constructor
	public Student() {
		System.out.println("Welcome to constructor");
		studentId = 10001;
		studentName = "Name of the student";
		studentEmail = "Email of the student";
	}
	
	//Parameterized Constructor
	public Student(int studentId,String studentName,String studentEmail) {
		System.out.println("Parameterized constrcutor has been called");
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student Id   : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Email: "+studentEmail);
	}
	
	public void showX() {
		int x = 10;
		System.out.println("X value is "+x);
		System.out.println("Global x value is "+this.x);
	}
}
