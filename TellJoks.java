
public class TellJoks {
	
	static void foo() {
		System.out.println("Hello Bro!, Good Morning!!");
	}
	
	static void foo(int a) {
		System.out.println("Hello Bro!, Good Morning!! "+a+" Times.");
	}
	
	static void foo(int a, int b) {
		System.out.println("Hello Bro!, Good Morning!! "+a+" Times.");
		System.out.println("Have a great Day!\n"+b+" Times, Returns This Day in Your Life.");
	}
	
	static void change(int arr[]) {
		arr[0]=98;
	}
	
	static void telljokes() {
		System.out.println("I invented a new word!\n"+"Plagiarism!\n");
	}
	
	
	public static void main(String[] args) {
		//telljokes();
//		int marks[] = {52,73, 77, 89, 65};
//		change(marks);
//		System.out.println(marks[0]);
		
		
		// Method Overloading 
		
		foo();
		foo(1000);
		foo(2000, 4000);
	}

}
