package project2;

public class Blocks {
	static{
		System.out.println("static block1 is loaded");
	}
	static Blocks b=new Blocks();
	


	public static void main(String[] args) {
		System.out.println("main method loaded");
		 Blocks b=new Blocks();

		
		// TODO Auto-generated method stub
		
	}
		{
			System.out.println("instance block is loaded");
			//Blocks b=new Blocks();

		}

		{
			System.out.println("instance block2 is loaded");
			//Blocks b=new Blocks();

		}


		{
			System.out.println("instance block3 is loaded");
			//Blocks b=new Blocks();

		}


		static Blocks b2=new Blocks();
		static{
			System.out.println("static block2 is loaded");
			Blocks b=new Blocks();

		}
		
		static{
			System.out.println("static block3 is loaded");
			 Blocks b3=new Blocks();
		}
		 //Blocks b3=new Blocks();
		static{
			System.out.println("static block4 is loaded");
		}

		 //Blocks b3=new Blocks();

}
