package project2;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		show();
	}
	

	static void show() {
	for (int n = 1; n <= 100; n++) {
	    int sum = 0;

	    for (int i = 1; i < n; i++) {
	        if (n % i == 0) {
	            sum += i;
	        }
	    }

	    if (sum == n) {
	        System.out.println(n);
	    }

	}
	}
}