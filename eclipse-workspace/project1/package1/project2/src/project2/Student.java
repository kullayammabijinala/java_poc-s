package project2;

public class Student {
	int id=98;
	String name="sandy";
	String course="devoops";
	
	Student(){ 
		this(65);	
	}
	Student(int id){
		this(id,"anu");	
	}
	Student(int  id,   String name){
		this(id,name,"java");
	}
	Student( int id,   String name, String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}

	public static void main(String[] args) {
		Student  s=new Student();
		s.display();
		Student  s1=new Student(87);
		s1.display();
		Student  s2=new Student(68,"chandhu");
		s2.display();
		Student  s3=new Student(68,"sanjay","python");
		s3.display();
		Student  s4=new Student(98,"sanjay","python");
		s4.display();
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);	
	}
}


