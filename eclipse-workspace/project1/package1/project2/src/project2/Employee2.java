package project2;

public class Employee2 {
	int empId;
	String empName;
	double salary;
	int a=20;
	int b=30;
	int c=40;

	Employee2(){
		//this(empId,empName,salary);
		System.out.println("no-args constructor");
		
	}
	
	
	Employee2(int empId,String empName,double salary){
		this.empId=empId;
		this.empName= empName;
		this.salary=salary;
	}
	Employee2(Employee2 emp2){
		this.empId=emp2.empId;
		this.empName=emp2. empName;
		this.salary=emp2.salary;
		//his.salary=emp2.salary;
	}

	public static void main(String[] args) {
		
		Employee2 emp2 =new Employee2(101,"anu",50000);
		emp2.display();
		Employee2 emp3 =new Employee2(emp2);
		emp3.empName="sai";
		emp3.increamentSalary(10000);
		emp3.display();
		emp3.show();
		//emp3.increamentSalary(1000);
		
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
	}
	void increamentSalary( double amount) {
		salary=salary+amount;
		
	}
	void show() {
		System.out.println(a<b && b>c);
		System.out.println(a>b && b>c);
		System.out.println(a<b && b<c);
		System.out.println(a>b && b<c);
		System.out.println("*********************");
		System.out.println(a<b || b>c);
		System.out.println(a>b || b>c);
		System.out.println(a<b || b<c);
		System.out.println(a>b || b<c);
		System.out.println("*********************");
		System.out.println(!(a<b));
		System.out.println( !(b>c));
		System.out.println(!(a>c));
		System.out.println("*****************");
		System.out.println(a &b);
		System.out.println(a |c);
		System.out.println(c ^b);
		System.out.println(~b);
		
	
	}

}


//  class Employee3 extends Employee2{
//	 int empId;
//		String empName;
//		double salary;
//	 Employee3(){
//		 System.out.println("no-args constructor to child class");
//		
//		 
//	 }
//	 
//Employee3(Employee2 emp2){
//	System.out.println("parameterized constructor");
//	super();
//	super.empId=emp2.empId;
//	super.empName=emp2.empName;
//	super.salary=emp2.salary;
//		 
//	 }
//void display() {
//	System.out.println(empId);
//	System.out.println(empName);
//	System.out.println(salary);
//}
//	 public static void main(String[] args) {
//		 Employee3 e1=new Employee3();
//		 e1.display();
//		 
//	 }
//}

 