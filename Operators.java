package com.stud.array;

public class Operators {

	public static void main(String[] args) {
		// Assignment Operator
		 int number1, number2;
		 number1=10;
		 System.out.println("number1");
		 number2=number1;
		 System.out.println("number2");
		 
		 //Arithmetic Operator
		 double output;
		 
		 
		 //Addition Operator
		 output=number1+number2;
		 System.out.println("number1+number2="+output);
		 
		 //Subtraction Operator
		 output=number1-number2;
		 System.out.println("number1-number2="+output);
		 
		 //Multiplication Operator
		 output=number1*number2;
		 System.out.println("number1*number2="+output);
		 
		 //Division Operator
		 output=number1/number2;
		 System.out.println("number1/number2="+output);
		 
		 //Remainder Operator
		 output=number1%number2;
		 System.out.println("number1%number2="+output);
		 
		 //Unary Operator
		 double number=10,resultNumber;
		 boolean flag=false;
		 
		 System.out.println("+number="+ +number);
		 //number is equal to 10.
		 
		 System.out.println("-number="+-number);
		 //number is equal to 10.
		 
		 //++number is equivalent to number=number+1
		 
		 System.out.println("number="+ ++number);
		 //number is equal to 11.
		 
		 //--number is equivalent to number=number-1
		 System.out.println("number="+ --number);
		 
		 //number is equal to 10
		 System.out.println("!flag="+ !flag);
		 
		 //flag is still false.
		 
		 System.out.println("number++");
		 System.out.println("number");
		 
		 System.out.println("++number");
		 System.out.println("number");
		 
		 //Relational Operator
		 if(number1>number2) {
			 System.out.println("number1 is greater than number2.");
		 }
		 if(number1<number2) {
			 System.out.println("number2 is greater than number1.");
		 }
		 if(number1==number2) {
			 System.out.println("number1 is equal to number2.");
		 }
		 
		 //Logical Operator
		 int number3=20;
		 boolean result;
		 
		 //Logical OR Operator
		 result=(number1>number2) || (number3>number1);
		 
		 //result will be true because number3 greater than number1
		 System.out.println(result);
		 
		 //Logical AND Operator
		 result=(number1>number2) && (number3>number1);
		 
		 //result will be false because number1 is equal to number2
		 System.out.println(result);
		 
		 //Ternary Operator
		 int februaryDays=29;
		 String display;
		 
		 display=(februaryDays==28)?"Not a leap year":"Leap Year";
		 System.out.println(display);
		 
		 //Bitwise Operator
		 int a=50;
		 int b=20;
		 int c=0;
		 
		 c=a&b;
		 System.out.println("a&b="+c);
		 
		 c=a|b;
		 System.out.println("a|b="+c);
		 
		 c=a^b;
		 System.out.println("a^b="+c);
		 
		 c=~a;
		 System.out.println("~a="+c);
		 
		 //Shift Operator
		 c=a>>2;
		 System.out.println("a>>2="+c);
		 
		 c=a<<2;
		 System.out.println("a<<2="+c);
		 
		 
		 }

	}


