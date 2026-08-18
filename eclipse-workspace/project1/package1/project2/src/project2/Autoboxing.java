package project2;

public class Autoboxing {
	protected void finalize() {
		System.out.println("gc allowed");
		
	};
            
	Integer i=10;// Integer i=Integer.valueOf(10),autoboxing
	int i2=i; 
	
	int i4=i.intValue();
 float i5=i.floatValue();
	short i6=i.shortValue();
	byte i7=i.byteValue();// int i4=i.intValue(); auto-unboxing
	String s="874876";
	int i3=i.parseInt(s);
	
	
	

	public static void main(String[] args) {
	Integer o=18;
		
		// TODO Auto-generated method stub
		
		Autoboxing a=new Autoboxing();
		System.out.println(a.i);
		System.out.println(a.i2);
		System.out.println(a.s);
		System.out.println(a.i3);
		System.out.println(a.i4);
		System.out.println(a.i5);
		System.out.println(a.i6);
		System.out.println(a.i7);
		System.out.println(15);
		System.out.println(o);
		Autoboxing a1=new Autoboxing();
		Autoboxing a2=new Autoboxing();
		
		a2=null;
		a1=null;
		System.out.println(a1);
		System.out.println(a2);
		//System.gc();
		System.out.println("a1 is allowed for gc");
		a1=a2;
		
		
	
		System.out.println(a1);
		System.gc();
		System.out.println(a2);
	}

}
