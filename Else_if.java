import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/*
		int age;
		System.out.print("Enter Your age here : ");
		age=sc.nextInt();
		if(age>50) {
			System.out.println("You are Experienced.");
		}
		else if(age>40) {
			System.out.println("You are semi-experienced.");
		}
		else if(age>30) {
			System.out.println("You are semi-semi-experienced.");
		}
		else {
			System.out.println("You are not exeprienced.");
		}
		*/

		// Switch statement in java
		int age;
		System.out.println("Enter the age :");
		age=sc.nextInt();
		switch(age) {
		
		case 18:
			System.out.println("You are eligible for vote.");
			break;
			
		case 23:
			System.out.println("You are eligible for Drive.");
			break;
		
		case 60:
			System.out.println("you have no longer service.");
			break;
			
		default:
			System.out.println("Enjoy your life.");
		}
	}

}
