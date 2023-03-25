import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//		for loop
		for(int i=0; i<=10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
		
		// odd number
		// 2n = even number   0, 2, 4, 6, ......
		// 2n+1 = odd number   1, 3, 5, 7, ......
		
		/*int n;
		System.out.println("Enter the number :");
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println(2*i+1);
		}*/
		
		//		print N natural number in reverse order
		int n;
		System.out.println("Enter the last of natural number :");
		n = sc.nextInt();
		for(int i=n; i>0; i--) {
			System.out.println(i);
		}

	}

}
