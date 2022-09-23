package com.stud.str;

public class StringBufferType {

	public static void main(String[] args) {
	    StringBuffer str=new StringBuffer("cooking");
	    
	    str.append("Emerging");
	    System.out.println(str);
	    
	    str.insert(3, "Technology");
	    System.out.println(str);
	    
	    str.replace(8, 16, "IOT");
	    System.out.println(str);
	    
	    str.reverse();
	    System.out.println(str);
	    
	    System.out.println(str.capacity());

	}

}
