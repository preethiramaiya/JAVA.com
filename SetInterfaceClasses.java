package com.stud.arry;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceClasses {

	public static void main(String[] args) {
		Set<Integer> sob=new HashSet<Integer>();
		sob.add(66);
		sob.add(13);
		sob.add(55);
		sob.add(38);
		sob.add(null);
		
	System.out.println(sob);
	System.out.println("LinkedHashset");
	
	Set<Integer> sob1=new LinkedHashSet<Integer>();
	sob1.add(66);
	sob1.add(77);
	sob1.add(99);
	sob1.add(65);
	sob1.add(null);
	System.out.println(sob1);
	System.out.println("Treeset Element");
	System.out.println("TreeSet");
	
	Set<Integer> sob2=new TreeSet<Integer>();
	sob2.add(55);
	sob2.add(44);
	sob2.add(22);
	sob2.add(25);
	sob2.add(17);
	
	System.out.println(sob2);

	}

}
