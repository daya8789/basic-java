
public class VarArgs {
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	static int sum(int x, int ... arr) {
		int Result=x;
		for(int a: arr) {
			Result += a;
		}
		return Result;
	}
	public static void main(String[] args) {
		System.out.println("\t\t\tThis is the VarArgs.\n");
		System.out.println("The sum of 4 and 5 is: "+sum(4, 5));
		System.out.println("The sum of 4, 5 and 6 is: "+sum(4, 5, 6));
		
		
		System.out.println("The sum is: "+sum(2, 3, 3,5));
		System.out.println("The sum is :"+ sum(5));
	}
}
