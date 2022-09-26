package com.stud.ass;

import java.util.Scanner;

class Show {
		String name;
		long mobilenumber;
		double cost;
		double discount;
		double amount;
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		name=sc .next();
		System.out.println("Enter mobilenumber");
		mobilenumber=sc .nextLong();
		System.out.println("Enter the Cost");
		cost=sc .nextDouble();

	}
	
	void calculate() {
		if(cost<=10000) {
			discount = cost*5/100;
			amount=cost-discount;
		}else if(cost>10000 && cost<=20000) {
			discount=cost*10/100;
			amount=cost-discount;
		}else if(cost>=20000 && cost<=35000) {
			discount=cost*15/100;
			amount=cost-discount;
		}else if(cost>35000) {
			discount=cost*20/100;
			amount=cost-discount;
		}
	}
	void display() {
		System.out.println("Customer name is:"+name);
		System.out.println("mobilenumber is:"+mobilenumber);
		System.out.println("amount is:"+amount);
	}
	public class ShowRoom {

		public static void main(String[] args) {
			Show ob=new Show();
			ob.input();
			ob.calculate();
			ob.display();
			
		
		}
	}

}
