import java.util.Scanner;
public class Recursion {
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		// Recursion :- It is a function which call itself through out in the program.
		
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("The factorial of n is: "+ factorial(5));
//		System.out.println("The number is : ");
//		n=s.nextInt();
//		System.out.println("The factorial of n is: "+ factorial(n));
//		
	}
}
