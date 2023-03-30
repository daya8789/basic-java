
public class Array {

	private static Object sop;

	public static void main(String[] args) {
		// Array --> it is a collection of similar type of data
		// There are three way to declear the array
//		int [] marks;
//		marks = new int[5];
//		marks[0]=45;
//		marks[1]=34;
//		marks[2]=78;
//		marks[3]=90;
//		marks[4]=38;
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
		
//		String []string= {"Ram", "Mohan", "Shayam"};
//		System.out.println(string);
//		System.out.println(string.length);
//		System.out.println(string[0]);
//		System.out.println(string[1]);
//		System.out.println(string[2]);
		/*
		 * int []marks = {23,34,45,76,66,67,87}; System.out.println(marks.length);
		 * System.out.println(marks[0]); System.out.println(marks[6]);
		 * 
		 * // Displaying array System.out.println("Displaying array using for loop");
		 * for(int i=0; i<marks.length; i++) { System.out.println(marks[i]); }
		 * 
		 * System.out.println("Displaying the array in reverse order"); for(int
		 * i=marks.length-1; i>=0; i--) { System.out.println(marks[i]); }
		 * 
		 * System.out.println("Displaying the array using for each loop"); for(int
		 * element: marks) { System.out.println(element); }
		 */
		
		
		// multidimentional array
		System.out.println("Displaying the 2-D array using for each loop");
		int [][] flats;
		flats = new int [2][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		for(int i=0; i<flats.length; i++) {
			for(int j=0; j<flats[i].length; j++) {
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		

	}

}
