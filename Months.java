package com.stud.branch;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		String Month;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Month");
		Month=sc .next();
		switch(Month) {
		case "January" :System.out.println("First Month of the Year");
		break;
		case "February" :System.out.println("Second Month of the Year");
		break;
		case "March" :System.out.println("Third Month of the Year");
		break;
		case "April" :System.out.println("Fourth Month of the Year");
		break;
		case "May" :System.out.println("Fifth Month of the Year");
		break;
		case "June" :System.out.println("Sixth Month of the Year");
		break;
		case "July" :System.out.println("Seventh Month of the Year");
		break;
		case "August" :System.out.println("Eighth Month of the Year");
		break;
		case "September" :System.out.println("Ninth Month of the Year");
		break;
		case "October" :System.out.println("Tenth Month of the Year");
		break;
		case "November" :System.out.println("Eleventh Month of the Year");
		break;
		case "December" :System.out.println("Twelveth Month of the Year");
		break;
		default :
			System.out.println("Invalid Input");
		
		}

	}

}
