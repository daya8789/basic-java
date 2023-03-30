import java.util.Scanner;
public class PracticeSet2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		float a = 7/4.0f*9/2.0f;
//		System.out.println(a);
		
		/*		Question 2
				 WAP to encript the grade by adding 8 to it 
				 	and decrept it to show the grade
		 */
		char grade = 'B';
		grade = (char)(grade + 8);		
		System.out.println(grade);					
		
		/*		Decreption		*/
		
		grade =(char)(grade-8);
		System.out.println(grade);
		
//		****		Question 3		*****
		
//		int a=sc.nextInt();
//		System.out.println(a>10);
		
//		****		Question no. 4		****
		
		/* float v=sc.nextFloat();
		float u=sc.nextFloat();
		float a=sc.nextFloat();
		float s=sc.nextFloat();
		float m=(v*v-u*u)/(2*a*s);
		System.out.println(m); */
		
		
//		****		Question no. 5 		****
		
		int a = 21*49/7+35/7;
		System.out.println(a);
		
		

	}

}
