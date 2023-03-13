import java.util.Scanner;
public class PracticeThree {

	public static void main(String[] args) {
		// WAP in java which ask user to enter his/her name and great them
		// with "Hello <name> have a good day" text.
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = s.next();
		System.out.println("Hello "+ name+", have a good day!");
		

	}

}
