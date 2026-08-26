package project2;

public class StrongNUmber {
	//strong number 145=1!+4!+5!=1+24+120=145

	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int r;
		int fact;
		int sum=0;
		
		while(temp>0) {
			r=temp%10;
			temp/=10;
			fact=1;
			int i=1;
			while(r>=i) {
				fact=i*fact;
				i++;
				
			}
			sum+=fact;
			
			
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("strong number");
		}else {
			System.out.println("not strong number");
		}
		// TODO Auto-generated method stub
		
	}

}
