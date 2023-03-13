
public class Logical {
		public static void main(String[] args) {
			// Logical AND operator
			boolean a=false;
			boolean b=false;
			boolean c=true;
			if(a && b && c) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			// Logical OR operator
			if(a || b) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			// Logical NOT operator
			System.out.println("\tLogical Not ");
			System.out.print("Not of a is ");
			System.out.println(!a);
			System.out.print("Not of b is ");
			System.out.println(!b);
		}
}
