package com.stud.branch;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char");
	    ch =sc.next().charAt(0);
		
		
		switch(ch) {
		case 'A' :System.out.println("A is an Vowel");
		break;
		case 'a' :System.out.println("a is an Vowel");
		break;
		case 'E' :System.out.println("E is an Vowel");
		break;
		case 'e' :System.out.println("e is an vowel");
		break;
		case 'I' :System.out.println("I is an Vowel");
		break;
		case 'i' :System.out.println("i is an Vowel");
		break;
		case 'O' :System.out.println("O is an Vowel");
		break;
		case 'o' :System.out.println("o is an Vowel");
		break;
		case 'U' :System.out.println("U is an Vowel");
		break;
		case 'u' :System.out.println("u is an Vowel");
		break;
		default :System.out.println("Enter char is not an Vowel");
		}
		

	}

}
