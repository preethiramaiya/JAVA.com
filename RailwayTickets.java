package com.stud.ass;

import java.util.Scanner;

class Railway {
	String name;
	String coach;
	long mobilenumber;
	int amount;
	int totalamount;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc .next();
		System.out.println("Enter the coach");
		coach=sc .next();
		System.out.println("Enter the mobilenumber");
		mobilenumber=sc .nextLong();
		System.out.println("Enter the amount");
		amount=sc .nextInt();
	}
	void update() {
		if(coach.equals("first_AC")) {
			totalamount=amount+700;
		}else if(coach.equals("second_AC")) {
			totalamount=amount+500;
		}else if(coach.equals("third_AC")) {
			totalamount=amount+250;
		}else if(coach.equals("sleeper")) {
			System.out.println("none");
		}
	}
	void display() {
		System.out.println("name is:"+name);
		System.out.println("coach is:"+coach);
		System.out.println("totalamount is:"+totalamount);
		System.out.println("mobilenumber is:"+mobilenumber);
		
	
		}
	}

public class RailwayTickets {

	public static void main(String[] args) {
	Railway ob=new Railway();
	ob.input();
	ob.update();
	ob.display();

	}

}
