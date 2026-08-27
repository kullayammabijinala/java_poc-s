package project2;

public class SumOfDigit {

	public static void main(String[] args) {
		int n=168;
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			
			n=n/10;
			sum+=r;
			//;
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub
 show();
 test();
	}
	static void show() {
	int n=168;
	int r=0;
	int sum=0;
	for(int i=0;i<n;) {
		r=n%10;
		sum+=r;
		//i++;
		n=n/10;
		//i++;
	}
	System.out.println(sum);

}
	static void test() {
		int sum=0;
		for (int i=0;i<=100;i++) {
			if(i%2==0) {			
				sum+=i;
			}
			System.out.println(sum);
			}
		}
	
}
