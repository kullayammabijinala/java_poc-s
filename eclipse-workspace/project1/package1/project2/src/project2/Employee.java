package project2;

public class Employee {
	static String companyName;
	static String location;
	
	String employeeName;
	int salary;
	
	static {
		 
		 System.out.println("static block is bloaded");
		// System.out.println(companyName);
		 //System.out.println(location);
		// Employee e= new Employee();
			
		 companyName="tcs";
			location="hyd";
		
	}
	


	

	public static void main(String[] args) {
		//Employee e= new Employee();
		
		// TODO Auto-generated method stub
		
		 System.out.println("companyname:"+companyName);
		 System.out.println("location:"+location);
		 
		 Employee e1= new Employee();
		 e1.display();
		 System.out.println(companyName);
		 System.out.println(location);
		e1.employeeName="swetha";
		e1.salary=30000;
		 System.out.println(e1.employeeName);
		 System.out.println(e1.salary);
		 
		 Employee e2= new Employee();
		 e2.employeeName="latha";
			e2.salary=40000;
			 System.out.println(companyName);
			 System.out.println(location);
		 
		
		 System.out.println(e2.employeeName);
		 System.out.println(e2.salary);
			
			
		

	}
	{
	System.out.println("intance block is loaded");
	String employeeName="anjali";
	int salary=50000;
	
	}

	void display() {
		System.out.println("mathod loaded");
	}
	
	
}
