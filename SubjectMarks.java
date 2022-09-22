package com.stud.array;

import java.util.Scanner;

class Subject {
	int Science;
	int Maths;
	int English;
}

public class SubjectMarks {

	public static void main(String[] args) {
		Subject stud1= new Subject();
		stud1 .Science=80;
		stud1 .Maths=77;
		stud1 .English=79;
		
		Subject stud2= new Subject();
		stud2 .Science=85;
		stud2 .Maths=75;
		stud2 .English=81;
		
		//displaying marks for stud 1
		System.out.println("Marks for first Student");
		System.out.println(stud1 .Science);
		System.out.println(stud1 .Maths);
		System.out.println(stud1 .English);
		
		//displaying marks for stud 2
		System.out.println("Marks for second student");
		System.out.println(stud2 .Science);
		System.out.println(stud2 .Maths);
		System.out.println(stud2 .English);
		
		
		

	}

}
