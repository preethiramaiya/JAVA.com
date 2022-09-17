package com.condition;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc .nextInt();
		if(num%3 == 0) {
			System.out.println(num+" is Even number");
		}
		if(num%3 !=0) {
			System.out.println(num+" is Odd number");
		}

	}

}
