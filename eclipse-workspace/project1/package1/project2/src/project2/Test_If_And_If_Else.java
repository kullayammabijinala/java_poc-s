package project2;
import java.util.Scanner;


public class Test_If_And_If_Else {
	void show(int i) {
		System.out.println("first method started");
		if(i>0) {
			System.out.println("positive number:"+i);
		}else if(i==0) {
			System.out.println("neutral number:"+i);
			
		}
		else {
			System.out.println("negative  number:"+i);
		}
	}
		 void  evenod( int i) {
			
			 if(i%2==0) {
				 System.out.println("the number is even:"+i);
				 
			 }else {
				 System.out.println("the number is odd:"+i);
			 }
			 
			 if(i>=18) {
				 System.out.println("eligible for voting:"+i);
				 
			 }
			 else {
				 System.out.println("not eligible for voting:"+i);
			 }
			 
			
		 
		 if (((char)i>=65) &((char)i<=91)) {
			 System.out.println("the character is upper case:"+i);
			 
		 }else {
			 System.out.println("the character is lower case:"+i);
		 }
		 
		 if (i>=0&i<=5) {
			 System.out.println("kids:"+i);
		 }else if(i>=60&i<=100) {
			 System.out.println("grandparents:"+i);
		 }else if(i>=35& i<=60) {
			 System.out.println("parents age:"+i);
			 
		 }else if(i>=20&i<=35) {
			 System.out.println("elders age:"+i);
			 
		 }else if(i>=10&i<=20) {
			 System.out.println("youngers age:"+i);
			 
		 }
		 else if(i>=5&i<=10) {
			 System.out.println("chindrens age:"+i);
			 
		 }else {
			 System.out.println("age more than 100:"+i);
		 }
		 

		 }
	 void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int i=sc.nextInt();
		show(i);
		evenod(i);
		
//		System.out.println("enter s value:");
//		int s=sc.nextInt();
		
	
		// TODO Auto-generated method stub

	}

}
