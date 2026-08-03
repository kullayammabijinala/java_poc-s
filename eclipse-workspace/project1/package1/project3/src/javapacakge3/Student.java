package javapacakge3;

public class Student {
	//instance or non-static variables
	
	int sid=2;
	String sname="keerthi";
	
	//static variables
	static int orgId=3;
	static String orgname="swetha";
	
	

	public static void main(String[] args) {
		//accessing  for static variables
		//accessing static variables directly
		
		
		
		System.out.println(orgId);
		System.out.println(orgname);
		
		System.out.println(Student.orgId);//accessing static variables using class name 
		System.out.println(Student.orgname);
		
		
	
		
		//accessing for instance or non static variables 
		Student anu =new Student();
		anu.sid=1;
		anu.sname="anu";
		
		System.out.println(anu.orgId);//accessing the static variables using object ref var
	    System.out.println(anu.orgname);
		
		System.out.println(anu.sid);
		System.out.println(anu.sname);
		
		
		// TODO Auto-generated method stub

	}

}
