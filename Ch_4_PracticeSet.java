import java.util.Scanner;
public class Ch_4_PracticeSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a=10;
//		if(a=11) {
//			System.out.println("I am 11");
//		}	// assignment is not consider inside the if condition
//		else {
//			System.out.println("I am not 11");
//		}

	/*	//		Question no. 2
		byte m1, m2, m3;
		System.out.println("Enter the marks of Physics");
		m1=sc.nextByte();
		
		System.out.println("Enter the marks of Chemistry");
		m2=sc.nextByte();
		
		System.out.println("Enter the marks of Mathematics");
		m3=sc.nextByte();
		
		float avg = (m1+m2+m3)/3.0f;
		System.out.println("Your Overall percentage is : "+ avg);
		
		if(avg>=40 && m1>33 && m2>33 && m3>33) {
			System.out.println("Congratulations! You have been passed.");
		}
		else {
			System.out.println("Sorry! You have not been passed. please try again!");
		}
		*/
		
		/*		//	Question no. 3
		 float tax = 0;
		 System.out.println("Enter your income Lakhs per annum");
		 float income = sc.nextFloat();
		 if(income <= 2.5) {
			 tax = tax + 0;
		 }
		 else if(income >2.5 && income <= 5) {
			 tax = tax + 0.05f * (income - 2.5f);
		 }
		 else if(income > 5 && income <= 10) {
			 tax = tax + 0.05f * (5.0f - 2.5f);
			 tax = tax + 0.2f * (income - 5);
		 }
		 else if(income >= 10.0f) {
			 tax = tax + 0.05f * (5 - 2.5f);
			 tax = tax + 0.2f * (10 - 5);
			 tax = tax + 0.3f * (income - 10.0f);
		 }
		 
		 System.out.println("Your Total tax is "+ tax);
		 */
		 
		 /* //		Question no. 4
		 System.out.println("Enter the number of Day : ");
		 int day = sc.nextInt();
		 
		 switch(day) {
		 case 1:
			 System.out.println("Monday");
			 break;
			 
		 case 2:
			 System.out.println("Tuesday");
			 break;
			 
		 case 3:
			 System.out.println("Wednesday");
			 break;
			 
		 case 4:
			 System.out.println("Thursday");
			 break;
			 
		 case 5:
			 System.out.println("Friday");
			 break;
			 
		 case 6:
			 System.out.println("Saturday");
			 break;
			 
		 case 7:
			 System.out.println("Sunday");
			 break;
			 
		 default :
			 System.out.println("You have entered wronge number");
			 break;
		 }
		 */
		 
		 //		Question no. 5
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("The year is Leap Year.");
		}
		else {
			System.out.println("The year is not Leap Year.");
		}
		
		
		//		Question no. 6
		/* System.out.println("Enter your website here ");
		String website = sc.next();
		if(website.endsWith(".org")) {
			System.out.println("This is an Organisational website");
		}
		else if(website.endsWith(".com")) {
			System.out.println("This is a Commercial website");
		}
		else if(website.endsWith(".in")) {
			System.out.println("This is an Indian website");
		}
		else {
			System.out.println("Not found in record");
		}*/
	}

}
