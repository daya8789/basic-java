import java.util.*;
public class PracticeSet7 {
	
	static void multiplication(int n) {
		System.out.println("The table of "+n+" is :");
		for(int i=1; i<=10; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}

	static void Pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumRec(n-1);
	}
	
	static void pattern2(int n) {
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
	
	static int fib(int n) {
		if(n==1 || n==2) {
			return n-1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Problem no. 1
		//multiplication(5);
		
		
		// Problem no. 2
		//Pattern1(5);
		
		// Problem no. 3
//		int c = sumRec(6);
//		System.out.print("The sum of natural number is : "+c);
		
		
		//Problem no. 4
		//pattern2(4);
		
		
		//Problem no. 5
		int f = fib(5);
		System.out.print("The nth term of fibonacci is : "+ f);
		
	}

}
