package com.stud.project;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int TuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	//Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		}
	
	//generate an ID
	private String setStudentID() {
		//grade level + ID
		id++;
	  return this.studentID = gradeYear +"" + id;
	}
	//Enroll in courses
	public void enroll() {
		do {
		System.out.print("Enter course to enroll (0 to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n  " + course;
			TuitionBalance = TuitionBalance + costOfCourse;
		}
		else { 
		
			break;
		}
		}while (1!=0);
		
		}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + TuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		TuitionBalance = TuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	//Show status
	public String toString() {
		return "Name:" + firstName + " " + lastName +
				"\nGrade level:" + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + TuitionBalance;
	}

	}


