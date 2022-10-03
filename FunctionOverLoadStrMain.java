package com.stud.oops;

class StringOverLoad {
	void check(String str, char ch) {
		int charcount=0;
		for(int i=0; i<str.length(); i++) {
			char ch1=str.charAt(i);
			if(ch1==ch) {
				charcount++;
			}
		}
		System.out.println("No of " +ch+" present " +charcount+" times ");
	}
	
	void check(String str) { //str=EdubridgeIndia
		String s=str.toLowerCase(); //edubridgeindia
		//extract vowels
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='o' || ch=='u') {
				System.out.println(ch+ ",");
			}
		}

}
	
	public void reversestr(String s) {
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}
}


public class FunctionOverLoadStrMain {

	public static void main(String[] args) {
		StringOverLoad ob=new StringOverLoad();
		ob.check("success", 's');
		ob.check("EdubridgeIndia");
		ob.reversestr("computer");

	}

}
