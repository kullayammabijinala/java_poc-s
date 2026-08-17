package javapacakge3;

public class CricketPlayer {
	static String TeamName="India";
	String playerName;
	int Runs;
	

	public static void main(String[] args) {
		
		System.out.println("-------Object1-------");
		
		CricketPlayer c1=new CricketPlayer();
		
		c1.playerName="dhoni";
		c1.Runs=50;
		
		System.out.println(TeamName);
		System.out.println(c1.playerName);
		System.out.println(c1.Runs);
		
		
		System.out.println("-------Object2-------");
		
		CricketPlayer c2=new CricketPlayer();
		
		c2.playerName="virat";
		c2.Runs=70;
		
		System.out.println(TeamName);
		System.out.println(c2.playerName);
		System.out.println(c2.Runs);
		
		
		// TODO Auto-generated method stub

	}

}
