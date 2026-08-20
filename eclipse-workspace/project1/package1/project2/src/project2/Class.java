package project2;

public class Class {
	 int studentId;
	 String studentname;
	static int age=21;
static String Address="andhrapradesh";

	public static void main(String[] args) {
		//
		 //int studentId=0;
		
		// TODO Auto-generated method stub
		System.out.println("-----object1---------");
		Class stu=new Class();
		
		//stu.studentId=3;
		//stu.studentName="kavitha";
		//stu.age=23;
		//stu.Address="kurnool";

		
		System.out.println(stu.studentId);
		System.out.println(stu.studentname);
		System.out.println(stu.age);
		System.out.println(stu.Address);
		
		
		  
		
		
		System.out.println("-----object2---------");
		Class O2=new Class();
		 
		O2.studentId=4;
		O2.studentname="sandhya";
		O2.age=20;
		O2.Address="kadapa";

		System.out.println(O2.studentId);
		System.out.println(O2.studentname);
		System.out.println(O2.age);
		System.out.println(O2.Address);
		
		
		
		System.out.println("-----object3---------");
		Class Obj3=new Class();
		 
		Obj3.studentId=5;
		Obj3.studentname="swetha";
		Obj3.age=25;
		Obj3.Address="chittur";

		System.out.println(Obj3.studentId);
		System.out.println(Obj3.studentname);
		System.out.println(Obj3.age);
		System.out.println(Obj3.Address);
		
		
		

		
		

	}

}
