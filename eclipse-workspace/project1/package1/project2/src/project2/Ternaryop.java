package project2;

public class Ternaryop {

	public static void main(String[] args) {
		int a=-20;
		String s=(a>0)?"positive":"negative";
		System.out.println("the number is:"+s);
		int b=80;
		String marks=(b>=35)?((b>=35 &b<=50)?"D":(b>=50 & b<=60)?"c":(b>=60&b<=70)?"B":(b>=80&b<=100)?"A":"FAIL"):"FAIL";
		// TODO Auto-generated method stub
System.out.println("the grade of the student:"+marks);
	}

}
