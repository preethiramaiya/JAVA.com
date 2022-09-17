package com.condition;

import java.util.Scanner;

public class IfElseIfLadder {
      int num;
      void inputData() {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter number");
    	  num = sc .nextInt();
      }
      void checkNum() {
    	  if(num==10) {
    		  System.out.println("The number is 10");
    	  }
    	  else if(num==20) {
    		  System.out.println("The number is 20");
    		  
    	  }else if(num==30) {
    		  System.out.println("The number is 30");
    		  
    	  }else {
    		  System.out.println("The number is 40");
    	  }
      }
      public static void main(String[] args) {
    	  IfElseIfLadder ob=new IfElseIfLadder();
    	  ob.inputData();
    	  ob.checkNum();
    	  
		

	}

}
