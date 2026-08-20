package project2;
import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rs=new Random();
		int randomnumber=rs.nextInt(10)+1;
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=1;i<=3;i++) {
			System.out.println("enter a number");
			
			int usernumber=sc.nextInt();
			if(usernumber==randomnumber) {
				System.out.println("You won ");
				break;
			}
			else if  (i<=2)
				{
				System.out.println("try again");
			}
				else {
			    	System.out.println("better luck next time");
			    }
			}
		System.out.println("random number="+randomnumber);
	}

		}
