import java.util.*;
public class PatternProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i, j;
		System.out.print("Enter the number : ");
		n=sc.nextInt();
		
//		System.out.println("\nSquare Sheet Pattern\n");
//		for(i=0; i<n; i++) {
//			for(j=0; j<n; j++) {
//				System.out.print(" * ");				
//			}
//			System.out.println("");
//		}
//
//		
//		System.out.println("\n Right Triangle Pattern\n");
//		for(i=1; i<=n; i++) {
//			for(j=1; j<=i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println("");
//		}
//		
//		
//		//System.out.println("\n Right Triangle Pattern\n");
//		for(i=n; i>0; i--) {
//			for(j=1; j<=i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println("");
//		}
		
		for(i=n; i>0; i--) {
			for(j=0; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.print(" * \n");
		}
			System.out.println("");
		
	}
}
