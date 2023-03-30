import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) {
		System.out.println("Taking input from the user.");
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the first number :");
//		//int a = sc.nextInt();
//		float a1 = sc.nextFloat();
//		
//		System.out.println("Enter the number 2:");
//		//int b = sc.nextInt();
//		float b1 = sc.nextFloat();
//		
//		//int sum = a+b;
//		float sum1 = a1+b1;
//		
//		System.out.print("The sum of two number is : ");
//		//System.out.println(sum);
//		System.out.println(sum1);
//		
//		String str = sc.nextLine();
//		System.out.println(str);
		
		boolean b1 = sc.hasNextInt();
		System.out.println(b1);
		
	}

}
