package com.stud.arry;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class EduStudent {
	int sid;
	String sname;
	float sfees;
	
	public EduStudent(int sid, String sname, float sfees) {
		super();
		this.sid=sid;
		this.sname=sname;
		this.sfees=sfees;
		
	}

	@Override
	public String toString() {
		
		return "EduStudent[sid="+sid+",sname="+sfees+"]";
		
	}
	
}

class StudentSortSid implements Comparator<EduStudent>{

	@Override
	public int compare(EduStudent o1, EduStudent o2) {
		if(o1.sid==o2.sid) 
		    return 0;
		else if(o1.sid<o2.sid)
			return -1;
		else
			return 1;
					
	}
	
}

public class StudentMainTreeSet {

	public static void main(String[] args) {
		EduStudent s1=new EduStudent(5,"Praveen",78654.5f);
		EduStudent s2=new EduStudent(2,"Hansika",7665.4f);
		EduStudent s3=new EduStudent(3,"Sharmila",7643.2f);
		
		StudentSortSid sob=new StudentSortSid();
		
		Set<EduStudent> tob=new TreeSet<EduStudent>(sob);
		tob.add(s1);
		tob.add(s2);
		tob.add(s3);
		
		System.out.println(tob);
	}
	
	//based on fees
	
	//based on name

}

