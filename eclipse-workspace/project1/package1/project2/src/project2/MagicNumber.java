package project2;

public class MagicNumber {

	public static void main(String[] args) {
		int n=1729;
		int temp=n;
		int r=0;
		int sum=0;
		//int sum1=sum;
		
		while(temp>0) {
			r=temp%10;
			temp/=10;
			sum+=r;
		}
		while(sum>0) {
			temp=sum;
			sum=0;
			while(temp>0) {
				r=temp%10;
				temp/=10;
				sum+=r;
				
			}
			break;
		}
			
			if(sum==1) {
					System.out.println("magic number");	
				}else {
					System.out.println("not a magic number");
				}	
			
		
		System.out.println(sum);
		// TODO Auto-generated method stub
		
	}

}
