package project2;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main method ");
		demo1();
		demo2(); 
		Test1 t1=new Test1();
		t1.demo3();
		// TODO Auto-generated method stub

	}
	static void demo1() {
		System.out.println("method one");
		
	}
static void demo2() {
	System.out.println("method two");
	demo1();
	Test1 t2=new Test1();
	t2.demo5();
	}
void demo3() {
	System.out.println("method three");
	demo1();
	demo4();
}
void demo4() {
	System.out.println("method four");
	
}
void demo5() {
	System.out.println("method five");
		
	}
	

}
