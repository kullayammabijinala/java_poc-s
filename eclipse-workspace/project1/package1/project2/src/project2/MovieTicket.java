package project2;
import java.util.Scanner;
public class MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		System.out.println("1.silver  200");
		System.out.println("2.gold 300");
		System.out.println("3.platinum 500");
		System.out.println("enter a number:");
		int a=sc.nextInt();
		
		//
		System.out.println("enter age:");
		int age=sc.nextInt();
		switch(a){
		
		case 1 -> {if(age>=60) {
			int price=200;
			System.out.println("silver");
			int price2=(price*10)/100;
			System.out.println(price-price2);
			
		};
		
		}
		
		case 2->{
			if(age<60 && age>=40) {
				int price=300;
				System.out.println("gold");
				System.out.println(price);
				
				
			};
		}
		case 3->{
			if(age<40 && age>=20) {
				int price=500;
				System.out.println("platinum");
				System.out.println(price);	
			};
			
		
		}
		default-> System.out.println("no tickets are available4");
		}	

	}

}
