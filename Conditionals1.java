import java.util.*;
public class Conditionals1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//	1. Write the java statement that assigns 1 to x if y is greater than 0
		
//		int x, y;
//		System.out.print("Enter the value of Y :");
//		y=sc.nextInt();
//		if(y>0) {
//			x=1;
//			System.out.println("The value of x is "+x);
//		}else {
//			System.out.println("Ye Galat hai.");
//		}
		
		
//		2. Suppose that score is a variable of type double. Write the java statement that increases
//		the score by 5 marks if score is between 80 and 90

//		double score;
//		System.out.print("Enter the score :");
//		score = sc.nextDouble();
//		if(score<=90 && score>=80) {
//			score += 5;
//			System.out.println("New score is "+score);
//		}else {
//			System.out.println("No increment.");
//		}
		
//		3. Rewrite in Java the following statement without using the NOT (!) operator:
//			item = !( (i<10) | | (v>=50) )

//		4. Write a java statement that prints true if x is an odd number and positive
		
//		int x;
//		System.out.print("Enter the number : ");
//		x=sc.nextInt();
//		if(x%2!=0 && x>0) {
//			System.out.println("Number is odd number and positive");
//		}else {
//			System.out.println("Number is even");
//		}
		
		
		//5. Write a java statement that prints true if both x and y are positive numbers
		
//		int x, y;
//		System.out.println("Enter the number x and then y :");
//		x=sc.nextInt();
//		y=sc.nextInt();
//		if(x>0 && y>0) {
//			System.out.println("True !, Because "+x+" and "+y+" both are positive");
//		}
//		else if(x<0 && y<0){
//			System.out.println(x+" and "+y+" both have same sigh ( - ).");
//		} 
//		else {
//			System.out.println("False");
//		}
		
									
						// Simplycoding
		
		//1 . Accept a numbers and check whether the number is divisible by both 2 and 3 or not.
//		int x;
//		System.out.print("Enter the number : ");
//		x = sc.nextInt();
//		if(x%2==0 && x%3==0) {
//			System.out.println("The number "+x+" is divisible by 2 and 3.");
//		}else {
//			System.out.println("The number "+x+" is not divisible by 2 and 3.");
//		}
		
		
		//2 . Check whether the given number is even, odd or zero.
//		int number;
//		System.out.print("Enter the number : ");
//		number = sc.nextInt();
//		if(number==0) {
//			System.out.println("The number is Zero.");
//		}else if(number%2==0) {
//			System.out.println("The number "+number+" is Even.");
//		}else {
//			System.out.println("The number "+number+" is Odd.");
//		}
	
	
		
		// Write a java program to check and display whether the number has single digit or two digit or more
//		int a;
//		System.out.print("Enter the number : ");
//		a = sc.nextInt();
//		if((a>=0 && a<10) || (a<0 && a>-10)) {
//			System.out.println("The number "+a+" is of Single digit.");
//		}else if((a>=10 && a<100) || (a<=-10 && a>-100)) {
//			System.out.println("The number "+a+" is of Two digit.");
//		}else {
//			System.out.println("The number "+a+" is of more than two digit.");
//		}
		
		
		//3 . Finding largest of three numbers using if-else- if
//		int a, b, c;
//		System.out.print("Enter the First number : ");
//		a = sc.nextInt();
//		System.out.print("Enter the Second number : ");
//		b = sc.nextInt();
//		System.out.print("Enter the third number : ");
//		c = sc.nextInt();
//		if(a>b && a>c) {
//			System.out.println("The number "+a+" is largest.");
//		}else if(b>c) {
//			System.out.println("The number "+b+" is largest.");
//		}else {
//			System.out.println("The number "+c+" is largest.");
//		}
		
		
		
		//4 . check whether the input year is leap or not
//		int year;
//		System.out.print("Enter the year : ");
//		year = sc.nextInt();
//		if((year%4==0) && (year%100!=0) || (year%400==0)) {
//			System.out.println("The year "+year+" is leap year.");
//		}else {
//			System.out.println("The year "+year+" is not leap year.");
//		}
		
		
		//5 . Write a program to enter two unequal numbers. If the first number is greater then display square of the smaller number and cube of the greater number otherwise, vice-versa. If the numbers are equal, display the message “Both the numbers are equal”.
		int x, y;
		System.out.print("Enter the first number : ");
		x = sc.nextInt();
		System.out.print("Enter the second number : ");
		y = sc.nextInt();
		if(x == y) {
			System.out.println("Both number are Equals.");
		}else if(x>y) {
			x = x*x*x;
			y = y*y;
			System.out.println("The square of smaller no. is : "+y+"\nThe cube of larger no. is : "+x);
		}else {
			y = y*y;
			x = x*x*x;
			System.out.println("The square of larger no. is : "+y+"\nThe cube of smaller no. is : "+x);
		}
	}
}
