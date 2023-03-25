import java.util.Scanner;
public class Do_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// do while loop
		int b = 0;
		do {
			System.out.println(b);
			b++;
		}while(b<5);
		
		// Quick quize Question
		System.out.println("\t\t\tPrint the n natural number");
		int n, i;
		System.out.println("Enter the last natural number till you want :");
		n = sc.nextInt();
		i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		
	}

}
