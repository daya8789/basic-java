import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// calculation of marks in percentage
		System.out.println("Marks in percentage");
		Scanner a = new Scanner(System.in);
		
		System.out.println("Marks of Mathematics :");
		float math = a.nextFloat();
		
		System.out.println("Marks os Physics :");
		float phy = a.nextFloat();
		
		System.out.println("Marks of Chemistry :");
		float chem = a.nextFloat();
		
		System.out.println("Marks of English :");
		float eng = a.nextFloat();
		
		System.out.println("Marks of Hindi :");
		float hindi = a.nextFloat();
		
		float total = math+phy+chem+eng+hindi;
		float percent = total/5;
		System.out.println("The total marks is : " + total);
		System.out.println("The percentage is : " + percent);
		
		
	}

}
