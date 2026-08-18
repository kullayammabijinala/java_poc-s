package project2;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		boolean status=isarmstrong(n);
		 if(status) {
			 System.out.println("armstrong");
		 }else {
			 System.out.println("not armstrong");
		 }

	}
	 static boolean isarmstrong(int n) {
		 boolean status =false;
		 int n1=String.valueOf(n).length();
		 int temp=n;
		 int r=0;
			int sum=0;
			while(temp>0) {
				r=temp%10;		
				temp=temp/10;
				sum=sum+(Math.powExact(r, n1));
				//System.out.println(sum);
			}
			if(sum==n) {
				status=true;
			}
		
		 return status;
		 
	 }

}
