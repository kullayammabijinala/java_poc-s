package project2;

import java.util.Scanner;

public class StudentResult {
	 void displayStudent(String name){
		 System.out.println("student name :"+ name);
		
	}
	 static void calculateTotal(int m1, int m2, int m3){
		 int total=m1 + m2 + m3;
		 System.out.println("student total marks :"+total);
		
	}
	 void calculateAverage(int m1, int m2, int m3) {
		
		  System.out.println("student average  marks:"+(m1+m2+m3)/3);
	 }

	public static void main(String[] args) {
		StudentResult s=new StudentResult();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter student name:");
		String name=s1.nextLine();// TODO Auto-generated method stub
		s.displayStudent(name);
		System.out.println("studnet total marks :");
		int m1=s1.nextInt();
		int m2=s1.nextInt();
		int m3=s1.nextInt();
		calculateTotal(m1,m2, m3);
		System.out.println("studnet average  marks :");
		
		
		 s.calculateAverage(m1,m2 ,m3);
	}

}
