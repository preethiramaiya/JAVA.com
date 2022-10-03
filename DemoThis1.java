package com.stud.oops;

public class DemoThis1 {
	int i, j, s;
    DemoThis1() {
	this(8);
		System.out.println("No arg constructor");
	}
	DemoThis1(int i) {
		System.out.println("One argument constructor");
	}
	void add(int i, int j) {
		this.i=i;
		this.j=j;
		System.out.println("Inside Addition:"+this);
		s=i+j;
	}
	void display() {
		System.out.println("sum of "+i+" and "+j+" is "+s);
	}
	
	public static void main(String[] args) {
		DemoThis1 ob=new DemoThis1();
		DemoThis1 ob1=new DemoThis1();
		System.out.println("Create object "+ob);
		ob.add(6,7);
		ob.display();
		ob1.add(5, 9);
		ob1.display();

	     

	}

}
