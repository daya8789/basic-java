
public class Metthods {
	
	static int sum(int a, int b) {
		int c;
		if(a>b) {
			c = a+b;
		}
		else {
			c = (a+b)*5;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int a = 8;
		int b = 7;
		int c = sum(a, b); 
		System.out.println(c);

	}

}
