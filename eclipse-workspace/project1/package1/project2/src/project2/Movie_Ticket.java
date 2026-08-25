package project2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Movie_Ticket {
	
	//wrapper object datatypes
	 Integer Ticket_ID=25;
	 Integer Screen_Number=77;
	 Integer Ticket_Price=258;
	 Boolean Online_Booking_Status=true;
	 Integer Viewer_Age=54;
	 Integer Number_of_Tickets=560;
	 Long Contact_Number=9121814772l;
	 Integer GST_Amount=60;
	 
	 //pee-defined Object  datatypes
	  String s1=new String("sai");
	  StringBuilder s2=new  StringBuilder("37486393");
	  StringBuffer s3=new  StringBuffer("478478756");
	  BigDecimal b1=new BigDecimal("8478367586347545.4989758974");
	  BigDecimal b2=new BigDecimal("8478367586347545.4989758974");
	  BigInteger b3=new  BigInteger("646354637234636565653645635");
	  BigInteger b4=new  BigInteger("646354637234636565653645635");
	  
	  //literals 4-types
	  //decimal literal-0-7=8
	  //octal literal-0-9=10
	  //hexadecimal-0-9,a-f,A-F=16
	  //birany literal-0-1=2,0=true,1=false
	  
	  int d=124;
	  int o=126568;
	  int h=0x377fAbF;
	  int b=0;
	  
	  float d1=124;
	  float o1=(int)1.68;//explicit typecasting
	  float h1=0x377fAbF;
	  float boo=0;
	  
	  long d2=124;
	  long o2=126568;
	  long h2=0x377fAbF;
	  long boo1=0;
	  
	  short d3=124;
	  short o3=12;
	  short h3=0x37F;
	  short boo3=0;
	  
	  double d4=124;
	 double o4=126568;
	  double h4=0x377fAbFD;
	  double boo4=0;
	  
	  char d5=124;
	  int o5=(int)126568D;
	  char h5=98;
	  char b5=0;
	  char c1='a';
	  char c2=1235;
	  char c3='\u7637';
	  char c4=0;
	  

	  

	public static void main(String[] args) {
		//local variables
		 int Ticket_ID=24;
		 int Screen_Number=76;
		 int Ticket_Price=250;
		 boolean Online_Booking_Status=true;
		 int Viewer_Age=34;
		 int Number_of_Tickets=500;
		 long Contact_Number=9121814772l;
		 int GST_Amount=50;
		 
		 int d6=1200;
		  int o6=127668;
		  int h6=0x8787fAbF;
		  int b6=1;
		  
		// TODO Auto-generated method stub
		 System.out.println("Ticket_ID:"+Ticket_ID);
		 System.out.println("Screen_Number:"+Screen_Number);
		 System.out.println("Ticket_Price:"+Ticket_Price);
		 System.out.println("Online_Booking_Status:"+Online_Booking_Status);
		 System.out.println("Viewer_Age:"+Viewer_Age);
		 System.out.println("Number_of_Tickets:"+Number_of_Tickets);
		 System.out.println("Contact_Number:"+Contact_Number);
		 System.out.println("GST_Amount:"+GST_Amount);
		 
		 System.out.println("****************************");
		 
		 Movie_Ticket m=new Movie_Ticket();
		 System.out.println("Ticket_ID:"+m.Ticket_ID);
		 System.out.println("Screen_Number:"+m.Screen_Number);
		 System.out.println("Ticket_Price:"+m.Ticket_Price);
		 System.out.println("Online_Booking_Status:"+m.Online_Booking_Status);
		 System.out.println("Viewer_Age:"+m.Viewer_Age);
		 System.out.println("Number_of_Tickets:"+m.Number_of_Tickets);
		 System.out.println("Contact_Number:"+m.Contact_Number);
		 System.out.println("GST_Amount:"+m.GST_Amount);
		 
		 
		 
		 
		 System.out.println("************************************");
		 Movie_Ticket b=new Movie_Ticket();
		 System.out.println(b.b3.mod(b.b4));
	System.out.println(m.s1);
	System.out.println(b.b1.add(b.b2));
	System.out.println(b.b1.multiply(b.b2));
	System.out.println(b.b3.divide(b.b4));
	System.out.println(b.b3.subtract(b.b4));
	System.out.println(b.s2);
	System.out.println(b.s3);
	System.out.println(b.s1+b.s2);
	System.out.println(b.s1+b.s3);
	
	System.out.println("******************************");
	System.out.println(b.d);
	System.out.println(b.o);
	System.out.println(b.h);
	System.out.println(b.b);
	
	System.out.println(b.d1);
	System.out.println(b.o1);
	System.out.println(b.h1);
	System.out.println(b.boo);
	
	System.out.println(b.d2);
	System.out.println(b.o2);
	System.out.println(b.h2);
	System.out.println(b.boo1);
	
	System.out.println(b.d3);
	System.out.println(b.o3);
	System.out.println(b.h3);
	System.out.println(b.boo3);
	
	System.out.println(b.d4);
	System.out.println(b.o4);
	System.out.println(b.h4);
	System.out.println(b.boo4);
	
	System.out.println(b.d5);
	System.out.println(b.o5);
	System.out.println(b.h5);
	System.out.println(b.b5);
	
	System.out.println(b.c1);
	System.out.println(b.c2);
	System.out.println(b.c3);
	System.out.println(b.c4);
	
	System.out.println(d6);
	System.out.println(o6);
	System.out.println(h6);
	System.out.println(b6);
	
	
	 
	}

}
