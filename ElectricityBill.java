package com.stud.ass;

import java.util.Scanner;

class Electricity {
	String name;
	int units;
	double bill;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name");
		name=sc .next();
		System.out.println("number of units");
		units=sc .nextInt();
	}
	void calculate() {
		if(units<=100) {
			bill= 2*units;
			
		}else if(units<=300) {
			bill= 3*units;
			
		}else if(units>300) {
			bill= 5*units;
		}
		}
		void display() {
			System.out.println("customer name is:"+name);
			System.out.println("Number of units is:"+units);
			System.out.println("bill is:"+bill);
		}
	
	}
	
  public class ElectricityBill {

	public static void main(String[] args) {
		Electricity ob=new Electricity();
		ob.input();
		ob.calculate();
		ob.display();
	}
		

	}


