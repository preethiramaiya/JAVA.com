package com.stack;

import java.util.HashSet;
import java.util.Set;


public class SetProgramMain {

	public static void main(String[] args) {
		Set<Character> s=new HashSet<Character>();
		s.add('M');
		s.add('p');
		s.add('K');
		s.add('R');
		s.add(null);
		s.add(null);System.out.println("Unordered Set Elements");
		System.out.println(s);
		
		boolean search = s.contains('B');
		System.out.println("Element B present in set:"+s);
		if(s.contains('M')) {
			System.out.println("M is present in set.");
		}
		else {
			System.out.println("M is not present in set.");
		}
		int hashcode =s.hashCode();
		System.out.println("Hashcode value:"+hashcode);

	}

}
