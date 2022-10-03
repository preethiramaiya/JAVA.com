package com.stud.oops;

class Addition {
	int i, j, s;
	void add(int i, int j) {
		this.i=i;
		this.j=j;
		System.out.println("Inside Addition:"+this);
		s=i+j;
	}
	void display() {
		System.out.println("sum of "+i+" and "+j+" is "+s);
	}
}

public class DemoThis {

	public static void main(String[] args) {
		Addition ob=new Addition();
		Addition ob1=new Addition();
		System.out.println("Create object "+ob);
		ob.add(6,7);
		ob.display();
		ob1.add(5, 9);
		ob1.display();

	}

}
