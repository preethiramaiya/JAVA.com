package com.stud.arry;

import java.util.Iterator;
import java.util.Stack;

public class StackOfOperation {

	public static void main(String[] args) {
		Stack<Integer> sob=new Stack<Integer>();
		sob.push(66);
		sob.push(95);
		sob.push(34);
		sob.push(25);
		sob.push(77);
		
		System.out.println(sob);
		System.out.println("Stack pop operation"+sob.pop());
		
		//Iterator
		Iterator<Integer> itstack=sob.iterator();
		while(itstack.hasNext()) {
			System.out.println(itstack.next());
		}
		
		

	}

}
