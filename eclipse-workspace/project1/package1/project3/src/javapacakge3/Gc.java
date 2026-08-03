package javapacakge3;

public class Gc {
	@Override
	protected void finalize()  {
		System.out.println("object destroyed");
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Gc g1=new Gc();
		Gc g2=new Gc();
		Gc g3=new Gc();
		Gc g4=new Gc();
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		
		g1=null;//nullifying object
		g2=null;
		
		g3=g4;//re-assigning of object
		System.gc();
		
		new Gc();		
		//System.gc();
		
		

	}
	

}
