import java.util.Scanner;
public class CgpaThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the numbers of sub1, sub2 and sub3 respectively:");
		float sub1=s.nextFloat();
		float sub2=s.nextFloat();
		float sub3=s.nextFloat();
		
		float cgpa=(sub1+sub2+sub3)/30;
		System.out.println("The cgpa is : "+ cgpa);

	}

}
