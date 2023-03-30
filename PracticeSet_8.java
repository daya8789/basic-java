import java.util.*;

public class PracticeSet_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 6 . Write a program to enter a number. If the number is positive even, display three succeeding 
		// even numbers. If the number is negative odd, display three preceding odd numbers otherwise, 
		// display the message ‘Number is neither a positive even nor a negative odd’.

//		int x;
//		System.out.println("Enter the number : ");
//		x = sc.nextInt();
//		if((x%2 == 0) && (x>0)) {
//			System.out.println("The three successive number is : "+ (x+2)+" "+(x+4)+" "+(x+6));
//		}else if((x%2 != 0) &&(x<0)){
//			System.out.println("The three preceding odd number is : "+ (x+2)+" "+(x+4)+" "+(x+6));
//		}else {
//			System.out.println("The number is neither a positive even nor a negative odd.");
//		}
		
		
		// 7 . Write a program to enter three numbers and a character. Find and print sum of the numbers 
		// if the given character is ‘s’ and product of the numbers if the given character is ‘p’. 
		// The program displays alphabet other than ‘s’ or ‘p’ .
		
		int a, b, c, sum=0, prod=1;
		String  ch;
		System.out.print("Enter the first number : ");
		a = sc.nextInt();
		System.out.print("Enter the second number : ");
		b = sc.nextInt();
		System.out.print("Enter the third number : ");
		c = sc.nextInt();
		System.out.println("For finding the sum please Enter -> s");
		System.out.println("For finding the product please Enter -> p");
		System.out.print("Enter the letter : ");
		ch = sc.next();
		if(ch == "s") {
			System.out.println("The sum is : "+ (a+b+c));
		}else if(ch == "p") {
			System.out.println("The product is : "+ (a*b*c));
		}else {
			System.out.println("You have entered invalid number.");
		}
		
	}

}
