package project2;

public class Lambdap {


	public static void main(String[] args) {
		
Car c1=()->{ 
	int velocity=100;
	String modelName="audi";
	System.out.println("drive is working");
	for(int i=0;i<10;i++)
		System.out.println(i);
	return 100;
};
System.out.println(c1.getVelocity());


	}
	
@FunctionalInterface
interface Car{
	public int getVelocity( );
}
}	