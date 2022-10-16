package com.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) {
		Stack<Integer> sop =new Stack<Integer>();
		sop.add(54);
		sop.add(77);
		sop.add(99);
		sop.add(23);
		sop.add(75);
		System.out.println(sop);
		System.out.println("Stack Operation:"+sop);
		Iterator<Integer> iter=sop.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
