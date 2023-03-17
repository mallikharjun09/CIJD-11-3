package com.tmf.se;

import java.util.Scanner;

public class Student {
	private final String studentName;
	private static String courseName;
	public static Scanner scan = new Scanner(System.in); 
	public static final double PI = 22/7.0;
	public Student() {
		studentName = "";
	}
	
	public Student(String studentName,String courseName) {
		this.courseName = courseName;
		this.studentName = "Mr."+studentName;
	}
	
	
	
	public static void displayStudentDetails(Student st) {
		
		System.out.println("Student Name : "+st.studentName);
		System.out.println("Course Chosen : "+ courseName);;
		
	}
	public static void main(String[] args) {
		Student st = new Student("Arun","PHP");
		displayStudentDetails(st);
	}
}











