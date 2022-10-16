package com.stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetProgramOperation {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		int size =list.size();
		System.out.println("Size before adding elements:");
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(25);
		list.add(55);
		list.add(70);
		System.out.println("Original order of list Elements:");
		System.out.println(list);
		
		Set<Integer> s=new HashSet<Integer>(list);
		System.out.println("Unordered List Elements After removing Duplicates.");
		System.out.println(s);
		
		

	}

}
