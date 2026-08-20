package project2;

import java.util.Scanner;
public class HerosDetails {
	
//private static int n;
//
//
//static int findNumber(int i) {
//	 
//	
//	 switch(i) {
//	
//	case 1:{System.out.println("positive number:"+i);
//	return i;
//	
//	}
//	    
//	case 2:{ System.out.println("negative number:"+i);
//		return i;}
//	case 3:{ System.out.println("neutral number:"+i);
//	   return i;}
//		
//	
//	}
//	return i;
//	}
//	


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		String hero_heroine=sc.next();
	
		switch(hero_heroine) {
		case "chiranjivi"->{
			String name="chiranjivi";
			int age=67;
			int numberOfMovies=110;
			int hits=50;
			String favMovie="kaidi150";
			long movieBurget=130000000;
			long profit=300000000;
			System.out.println(name);
			System.out.println(age);
			System.out.println( numberOfMovies);
			System.out.println(hits);
			System.out.println(favMovie);
			System.out.println(movieBurget);
			System.out.println(profit);
			
		}
		
	    case "balakrishna"->{
		String name="balakrishna";
		int age=67;
		int numberOfMovies=102;
		int hits=49;
		String favMovie="nara simha";
		long movieBurget=140000000;
		long profit=400000000;
		System.out.println(name);
		System.out.println(age);
		System.out.println( numberOfMovies);
		System.out.println(hits);
		System.out.println(favMovie);
		System.out.println(movieBurget);
		System.out.println(profit);
		
	}
	    case "nani"->{
			String name="nani";
			int age=37;
			int numberOfMovies=42;
			int hits=10;
			String favMovie="hi nana";
			long movieBurget=30000000;
			long profit=40000000;
			System.out.println(name);
			System.out.println(age);
			System.out.println( numberOfMovies);
			System.out.println(hits);
			System.out.println(favMovie);
			System.out.println(movieBurget);
			System.out.println(profit);
			
		}
	    case "alluarjun"->{
			String name="alluarjun";
			int age=37;
			int numberOfMovies=42;
			int hits=15;
			String favMovie="ala vaikunta puram";
			long movieBurget=34000000;
			long profit=46000000;
			System.out.println(name);
			System.out.println(age);
			System.out.println( numberOfMovies);
			System.out.println(hits);
			System.out.println(favMovie);
			System.out.println(movieBurget);
			System.out.println(profit);
			
		}
	   // default-> System.out.println("no hero foud here");
		
		
		case "saipallavi"->{
			String name="saipallavi";
			int age=28;
			int numberOfMovies=40;
			int hits=15;
			String favMovie="ramayam";
			long movieBurget=130000000;
			long profit=320000000;
			System.out.println(name);
			System.out.println(age);
			System.out.println( numberOfMovies);
			System.out.println(hits);
			System.out.println(favMovie);
			System.out.println(movieBurget);
			System.out.println(profit);
			
		}
		case "kajal"->{
			String name="kajal agarval";
			int age=32;
			int numberOfMovies=60;
			int hits=25;
			String favMovie="darling";
			long movieBurget=130000000;
			long profit=360000000;
			System.out.println(name);
			System.out.println(age);
			System.out.println( numberOfMovies);
			System.out.println(hits);
			System.out.println(favMovie);
			System.out.println(movieBurget);
			System.out.println(profit);
			
		}
		case "sri gouri priya"->{
			String name="sri gouri priya";
			int age=27;
			int numberOfMovies=15;
			int hits=8;
			String favMovie="chennai love story";
			long movieBurget=300000000;
			long profit=400000000;
			System.out.println(name);
			System.out.println(age);
			System.out.println( numberOfMovies);
			System.out.println(hits);
			System.out.println(favMovie);
			System.out.println(movieBurget);
			System.out.println(profit);
			
		}
		case "samantha"->{
			String name="samantha";
			int age=32;
			int numberOfMovies=70;
			int hits=30;
			String favMovie="ma inti bangaram";
			long movieBurget=3200000000l;
			long profit=4500000000l;
			System.out.println(name);
			System.out.println(age);
			System.out.println( numberOfMovies);
			System.out.println(hits);
			System.out.println(favMovie);
			System.out.println(movieBurget);
			System.out.println(profit);
			
		}
		default-> System.out.println("nohero or heroine detail found here!!,check another way");
		
		}
		
		
		
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter a symbal");
		String symb=sc.next();
		
		switch(symb) {
		case "+"->System.out.println(a+b);
		case "-"->System.out.println(a-b);
		case "*"->System.out.println(a*b);
		case "/"->System.out.println(a/b);
		case "%"->System.out.println(a%b);
		default->System.out.println
		("unknown sysbal doesn't take to perform any operations");
		}
		
		
	
        
		
		
		
//		switch(i) {
//		
//		case 1->{
//			if(c>0)
//			System.out.println(" positive number:"+c);}
//		case 2->{
//			if(c<0)
//				System.out.println(" negativenumber:"+c);}
//		case 3->{
//			if(c==0)
//				System.out.println(" neutral number:"+c);}
//		default->System.out.println("the number is not define in above cases");
//		}
		
		
	}

}
