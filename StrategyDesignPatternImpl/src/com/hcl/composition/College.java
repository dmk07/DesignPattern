package com.hcl.composition;

public class College {

//	private Student stud=new Student(); // inst var so when ever want to use it create college obj first
	
	
	public static void main(String[] args) {
	
	 College coll=new College();
//	 
//	 coll.stud.sname="Dipak";
//	 coll.stud.scity="PBN";
//	 
	 Student stud=new Student();
		
	 stud.setSname("dipak");
	 stud.setScity("pune");
	 
	 String details=stud.getStudent();
		System.out.print(details);
	}

}
