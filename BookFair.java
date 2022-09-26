package com.stud.ass;

import java.util.Scanner;

public class BookFair {
	String bname;
	double price,d;
	
	BookFair(){
		bname="";
		price=0;
		
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name");
		bname=sc .next();
		System.out.println("Enter price");
		price=sc .nextDouble();
		
	}
	void calculate() {
		if(price<=1000) {
			d=2/100*price;
		}else if(price<=3000) {
			d=10/100*price;
		}else {
			d=15/100*price;
		}
	}
	void display() {
		System.out.println("Book name is:"+bname);
		System.out.println("price"+price);
		
	}

	public static void main(String[] args) {
		BookFair ob=new BookFair();
		ob.input();
		ob.calculate();
		ob.display();
		

	}

}
