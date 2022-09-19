package com.stud.branch;

import java.util.Scanner;

class Area{
	float length, breadth, base, height, radius, area;
	Scanner sc=new Scanner(System.in);
	public void areaSquare() {
		System.out.println("Enter length of square");
		length=sc .nextFloat();
		area=length*length;
		System.out.println("Area of Square ="+area);
		
	}
	public void areaRectangle() {
		System.out.println("Enter length and breadth of rectangle");
		length=sc .nextFloat();
		breadth=sc .nextFloat();
		area=length*breadth;
		System.out.println("Area of Rectangle ="+area);
		
	}
	public void areaTriangle() {
		System.out.println("Enter base and height of triangle");
		base=sc .nextFloat();
		height=sc .nextFloat();
		area=(base*height)/2;
		System.out.println("Area of Triangle ="+area);
		
	}
	public void Circle() {
		System.out.println("Enter radius of circle");
		radius=sc .nextFloat();
		area=3.14159f*radius*radius;
		System.out.println("Area of Circle ="+area);
		
	}
	
}

public class AreaMain1 {

	public static void main(String[] args) {
		int choice;
		
		Area aob=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("**********MENU*********");
		System.out.println("1. Area of Square");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Area of Triangle");
		System.out.println("4.Area of Circle");
		System.out.println("Enter your choice");
		choice= sc .nextInt();
		
		switch(choice) {
		case 1: aob.areaSquare();
		      break;
		case 2: aob.areaRectangle();
		      break;
		case 3: aob.areaTriangle();
		      break;
		case 4: aob.Circle();
		      break;
		 default:
			 System.out.println("Invalid Input");
		      
		      
		}

	}

	
}
