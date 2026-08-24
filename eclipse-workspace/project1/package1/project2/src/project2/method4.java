package project2;
import java.util.Scanner;
 class method4 {
	  double calculateInterest(double principal, double rate, int time) {
		  return principal*rate*time ;
	  }
	  void  displayName() {
		  System.out.println("hello");
		  String name="";
		
	  }
	  void displayRollNumber(double rollno) {
		  System.out.println("displayrollnumber :"+rollno);
		  
	  }
	  String displayCollege() {
		  String clgname="";
		  return clgname;
	  }
	 int  displayBranch() {
		 int a=0;
		 return a;
	 }
	 int  displayYear() {
		 int yop=0;
		
		 return yop;
	 }
	  float displayCGPA() {
		  float cgpa=0;
		  return cgpa;
		  
	  }
	  String displaySkills() {
		  String  skill1="";
		 String skill2="";
		 String skill3="";
		  return skill1+","+skill2+","+skill3;
		 
		  
		  
	  }
	  String displayProjects(String proj1,String proj2) {
		  return proj1+","+proj2;
		 
	  
	  }
	  String displayCertificates(String certi1,String certi2,String certi3) {
		  return certi1+","+certi2+","+certi3;
		 
	  }
	  String displayEmail() {
		   String displayemail="";
		   return displayemail;
	  }
	  long displayPhoneNumber(long pno) {
		  return pno;
		  
	  }
	  String displayAddress(String add) {
		  return add;
		  
	  }
	  String displayLinkedIn(String link) {
		  return link;
		  
	  }
	  String displayGitHub(String git) {
		  return git;
	  }
	  String displayResume(String res) {
		  return res;
	  }
	 
	public static void main(String[] args) {
		method4 m=new method4();
		// TODO Auto-generated method stub
		// calculateInterest(principal,rate,time);
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter principal:");
		 double p=sc.nextDouble();
		 System.out.println("enter rate:");
		 double r=sc.nextDouble();
		 System.out.println("enter time:");
		 int t=sc.nextInt();
		 System.out.println("calculateInterest:"+(p*r*t));
	     m.calculateInterest(p,r,t);
	     System.out.println("enter name:");
		 String dn=sc.next();
	     m.displayName();
	     System.out.println("enter rollnumber:");
		 double  rollno=sc.nextDouble();
	     m.displayRollNumber( rollno);
	     System.out.println("enter clg:");
		 String  clg=sc.next();
	     m.displayCollege();
	     System.out.println("enter branch:");
		 int b1=sc.nextInt();
	     m.displayBranch();
	     System.out.println("ente year of passed:");
	     int yop=sc.nextInt();
	     m.displayYear();
	     System.out.println("enter cpga:");
		 float  cgpa=sc.nextFloat();
	     m.displayCGPA();
	     System.out.println("enter skills:");
		 String  skill1=sc.next();
		 System.out.println("enter skill1:"+skill1);
		String  skill2=sc.next();
		 System.out.println("enter skill2:"+skill2);
		 String  skill3=sc.next();
		
		 System.out.println("enter skills:"+skill3);
	     m.displaySkills();
	     System.out.println("enter projects:");
		 String proj1=sc.next();
		 System.out.println("enter proj1:"+proj1);
		String proj2=sc.next();
		 System.out.println("enter proj2:"+proj2);
	     m.displayProjects(proj1,proj2);
	     System.out.println("enter certificates:");
		 String c1=sc.next();
		 System.out.println("enter certificates1:"+c1);
		 String c2=sc.next();
		 System.out.println("enter certificates2:"+c2);
		 String c3=sc.next();
		 System.out.println("enter certificates2:"+c3);
	     m.displayCertificates(c1,c2,c3);
	     System.out.println("enter email:");
		 String e=sc.next();
	     m.displayEmail();
	     System.out.println("enter pno:");
		 long pno=sc.nextLong();
	     m.displayPhoneNumber( pno);
	     System.out.println("enter add:");
		 String add=sc.next();
	     m.displayAddress( add);
	     System.out.println("enter link:");
		 String link=sc.next();
	    m. displayLinkedIn(link);
	     System.out.println("enter github:");
		 String git=sc.next();
	     m.displayGitHub(git);
	     System.out.println("enter resume:");
		 String res=sc.next();
	     m.displayResume(res);
	     System.out.println("*************************");
	     System.out.println("enter hobbies:");
		 String hob1=sc.next();
		 System.out.println("enter hobi1:"+hob1);
		 String hob2=sc.next();
		 System.out.println("enter hobi2:"+hob2);
	     displayHobbies();
	     System.out.println("enter strengths:");
		 String str1=sc.next();
		 System.out.println("enter strenth1:"+str1);
		 String str2=sc.next();
		 System.out.println("enter strength:"+str2);
	     displayStrengths( str1,str2);
	     System.out.println("enter weakness:");
		 String w=sc.next();
	     displayWeaknesses();
	     System.out.println("enter careergoal:");
		 String cg=sc.next();
	     displayCareerGoal();
	     System.out.println("enter ssc marks:");
		 int a=sc.nextInt();
	     displayEducation(a);
	     System.out.println("enter grade :");
		 char c=sc.next().charAt(0);
	     displaySSCDetails();
	     System.out.println("enter inter mark:");
		 int i=sc.nextInt();
	     displayIntermediateDetails( i);
	     System.out.println("enter btech:");
		float f=sc.nextFloat();
		System.out.println("enter btech:"+f);
	     displayBTechDetails();
	     
   
	     
	}
	  static String displayHobbies() {
		  String hob1="";
		  String hob2="";
		  return hob1+","+hob2;
		  
	  }
	  static  String displayStrengths(String str1,String str2) {
		
		  return str1+","+str2;
		 
	  }
	   static String displayWeaknesses() {
		   String weakness="";
		   return weakness;
	   }
	  static String displayCareerGoal() {
		  String cg="";
		  return cg;
		  
	  }
	  static int displayEducation(int a) {
		  return a;
		  
	  }
	  static char displaySSCDetails() {
		  char c=0;
		  return c;
		  
	  }
	   static int displayIntermediateDetails(int i) {
		   return i;
		   
	   }
	  static float displayBTechDetails() {
		  float f=0;
		  return f;
	  }
	

}
