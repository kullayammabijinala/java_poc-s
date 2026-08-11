package javapacakge3;
import java.util.Scanner;
public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose veg or fruit");
		String catg=sc.next();
		System.out.println("choose yes or no");
		String yn=sc.next();
//		System.out.println("enter item name");
//		String item=sc.next();
		int vegprice=0;
		int fruitprice=0;
		do {
		switch(catg) {
		
		case "veg":
		System.out.println("enter item name");
		String item=sc.next();
			do {
			switch(item) {
			
			case "tmt" -> {
			    System.out.println("Tomato per kg = 50 Rs");
			    int t = 50;
			    vegprice += t;
			}

			case "pot" -> {
			    System.out.println("Potato per kg = 40 Rs");
			    int p = 40;
			    vegprice += p;
			}

			case "oni" -> {
			    System.out.println("Onion per kg = 35 Rs");
			    int o = 35;
			    vegprice += o;
			}

			case "car" -> {
			    System.out.println("Carrot per kg = 60 Rs");
			    int c = 60;
			    vegprice += c;
			}

			case "cab" -> {
			    System.out.println("Cabbage per kg = 30 Rs");
			    int cb = 30;
			    vegprice += cb;
			}

			case "cau" -> {
			    System.out.println("Cauliflower per kg = 45 Rs");
			    int cf = 45;
			    vegprice += cf;
			}

			case "bri" -> {
			    System.out.println("Brinjal per kg = 55 Rs");
			    int b = 55;
			    vegprice += b;
			}

			case "bea" -> {
			    System.out.println("Beans per kg = 80 Rs");
			    int be = 80;
			    vegprice += be;
			}

			case "chi" -> {
			    System.out.println("Chilli per kg = 100 Rs");
			    int ch = 100;
			    vegprice += ch;
			}

			case "lad" -> {
			    System.out.println("Lady Finger per kg = 45 Rs");
			    int lf = 45;
			    vegprice += lf;
			}

			case "spi" -> {
			    System.out.println("Spinach per bunch = 20 Rs");
			    int sp = 20;
			    vegprice += sp;
			}

			case "cuc" -> {
			    System.out.println("Cucumber per kg = 35 Rs");
			    int cu = 35;
			    vegprice += cu;
			}

			case "pum" -> {
			    System.out.println("Pumpkin per kg = 25 Rs");
			    int pm = 25;
			    vegprice += pm;
			}

			case "rad" -> {
			    System.out.println("Radish per kg = 30 Rs");
			    int rd = 30;
			    vegprice += rd;
			}

			case "pea" -> {
			    System.out.println("Green Peas per kg = 90 Rs");
			    int gp = 90;
			    vegprice += gp;
			}
			default -> {
			    System.out.println("Invalid vegetable code.");
			}
			
			}
			}while(yn=="y" ||yn == "Y");
		
		case "fruit":
			System.out.println("enter item name");
			String item1=sc.next();
			do {
			switch(item1) {
			
			case "org"->{
				System.out.println("orange per kg =78rs");
				int o=78;
				fruitprice+=o;
				
			}
			case "app" -> {
			    System.out.println("Apple per kg = 120 Rs");
			    int a = 120;
			    fruitprice += a;
			}

			case "ban" -> {
			    System.out.println("Banana per dozen = 60 Rs");
			    int b = 60;
			    fruitprice += b;
			}

			case "man" -> {
			    System.out.println("Mango per kg = 150 Rs");
			    int m = 150;
			    fruitprice += m;
			}

			case "grp" -> {
			    System.out.println("Grapes per kg = 90 Rs");
			    int g = 90;
			    fruitprice += g;
			}

			case "pin" -> {
			    System.out.println("Pineapple per piece = 80 Rs");
			    int p = 80;
			    fruitprice += p;
			}

			case "pap" -> {
			    System.out.println("Papaya per kg = 50 Rs");
			    int pa = 50;
			    fruitprice += pa;
			}

			case "wat" -> {
			    System.out.println("Watermelon per piece = 100 Rs");
			    int w = 100;
			    fruitprice += w;
			}

			case "mus" -> {
			    System.out.println("Muskmelon per kg = 60 Rs");
			    int mu = 60;
			    fruitprice += mu;
			}

			case "pom" -> {
			    System.out.println("Pomegranate per kg = 180 Rs");
			    int po = 180;
			    fruitprice += po;
			}

			case "gua" -> {
			    System.out.println("Guava per kg = 70 Rs");
			    int gu = 70;
			    fruitprice += gu;
			}

			case "str" -> {
			    System.out.println("Strawberry per box = 150 Rs");
			    int s = 150;
			    fruitprice += s;
			}

			case "kiw" -> {
			    System.out.println("Kiwi per piece = 40 Rs");
			    int k = 40;
			    fruitprice += k;
			}

			case "che" -> {
			    System.out.println("Cherry per box = 200 Rs");
			    int c = 200;
			    fruitprice += c;
			}

			case "lic" -> {
			    System.out.println("Litchi per kg = 160 Rs");
			    int l = 160;
			    fruitprice += l;
			}

			case "sap" -> {
			    System.out.println("Sapota per kg = 80 Rs");
			    int sa = 80;
			    fruitprice += sa;
			}
			default->System.out.println("invalid fruit code");
			}
		}
		while(yn=="y"||yn=="Y");
	
		
		
	
		// ODO Auto-generated method stub
System.out.println("totalprice of veg="+vegprice);
System.out.println("totalprice of fruits="+fruitprice);
System.out.println("total price of both="+(vegprice+fruitprice));
		}	
		}while(yn=="y"||yn=="Y");
	}

	}
	


		