import java.util.Scanner;
public class AdditionThree {

	public static void main(String[] args) {
		// Addition of three number taking input from user
		Scanner ad = new Scanner(System.in);
		
		System.out.print("Enter the number 1: ");
		int a=ad.nextInt();
		
		System.out.print("Enter the number 2: ");
		int b=ad.nextInt();
		
		System.out.print("Enter the number 3: ");
		int c=ad.nextInt();
		
		int sum=a+b+c;
		System.out.println("The sum of these numbers is : "+ sum);
		
	}

}
