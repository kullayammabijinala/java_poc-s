package com.oops;

public class Person {
	String name="anu";
	int age=34;	
}

 class Student extends Person{
	 String clgName="St.Marys";
	 
	public static void main(String[] args) {
		Student s=new Student();
		 System.out.println(s.name);
		 System.out.println(s.age);
		 System.out.println(s.clgName);
		
	}

}
