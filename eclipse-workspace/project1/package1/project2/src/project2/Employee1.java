package project2;

public class Employee1 {
	@Override
	protected void finalize() {
		System.out.println("object destroyed");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee1 e1=new  Employee1();
		 System.out.println(e1);
		 
		 Employee1 e2=new  Employee1();
		 System.out.println(e2);
		 
		 Employee1 e3=new  Employee1();
		 System.out.println(e3);
		 
		 Employee1 e4=new  Employee1();
		 System.out.println(e4);
		 
		 e1=null;
		 e2=null;
		 
		 System.gc();
		 System.out.println(e1);

		 System.out.println(e2);
	}

}
