package com.tmf.spro.backend.services;

import java.util.Scanner;

import com.tmf.spro.backend.model.Student;

public class StudentServices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Student object array
		//datatype arrayname[] = new datatype[size];
		
		Student students[] = new Student[5];
		
			System.out.println("Enter a student Id ");
			int id = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter a student Name ");
			String name = scan.nextLine();
			scan.nextLine();
			System.out.println("Enter a student Email ");
			String email = scan.nextLine();
			scan.nextLine();
			
			//Create a new student object without parameters
			Student st = new Student();
			
			//Create a new Student object with parameters
			Student st1 = new Student(id, name, email);
			
			//set details to the object
			//st.setStudentDetails(id, name, email);
			
			st.displayStudentDetails();
			st.showX();
			
			st1.displayStudentDetails();
			
			st1.
	}
}
