import java.util.Scanner;
public class PracticeSet6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * //problem no. 1 
		 * float [] marks = {67.8f, 34.5f, 56.4f, 89.9f, 45.1f};
		 * float sum = 0; 
		 * for(float element: marks) { 
		 * 		sum = sum + element; 
		 * }
		 * System.out.println("The sum is "+ sum);
		 */
		
		
		/*
		 * float [] marks = {67.8f, 34.5f, 56.4f, 89.9f, 45.1f}; float num;
		 * System.out.print("Enter the element :"); num = sc.nextFloat(); boolean
		 * isInArray = false; for(float element : marks) { if(num == element) {
		 * isInArray = true; break; } } if(isInArray) {
		 * System.out.println("The element is in the array."); } else {
		 * System.out.println("The element is not in the array.");
		 * 
		 * }
		 */
		
		//		Problem no.3
		/*
		 * float [] marks = {67.8f, 34.5f, 56.4f, 89.9f, 45.1f}; float sum = 0;
		 * for(float element: marks) { sum = sum + element; }
		 * System.out.println("The average is "+ sum/marks.length);
		 */
		
		/*//		Problem no. 4
		
		int [][] mat1= {{2, 3, 4},
						{5, 6, 7}};
		
		int [][] mat2 = {{9, 7, 4},
						 {6, 2, 8}};
		
		int [][] result = {{0, 0, 0},
						   {0, 0, 0}};
		
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat2[i].length; j++) {
				System.out.println("This the element of array "+ i +" "+ j);
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
			System.out.println("");
		}
		System.out.println("The sum of two array is: ");
		
		for(int i=0; i<mat1.length; i++){
			for(int j=0; j<mat1[i].length; j++) {
				System.out.print(result[i][j] + " ");
				//result[i][j] = mat1[i][j] + mat2[i][j];
			}
			System.out.println("");
		}	
		
		
		//		Problem no. 5
		int []arr = {1, 23, 3, 44, 5, 16};
		System.out.println("The array is :");
		for(int element: arr) {
			System.out.print(element+" ");
		}
		int l = arr.length;
		int n = Math.floorDiv(l, 2);
		int temp;
		for(int i=0; i<n; i++) {
			temp = arr[i];
			arr[i] = arr[l-1-i];
			arr[l-1-i] = temp;
		}
		System.out.println("\nThe reverse array is :");
		for(int element: arr) {
			System.out.print(element+" ");
		}
		*/
		
		// 		Problem no. 6
		int []arr = {1, 23, -3543, 44, 895, 16};
		int max = Integer.MIN_VALUE;
		for(int e:arr) {
			if(e>max) {
				max = e;	
			}
		}
		System.out.println("The max value is :"+ max);
		
		//		Problem no. 7
		int min = Integer.MAX_VALUE;
		for(int m:arr) {
			if(m<min) {
				min = m;
			}
		}
		System.out.println("The min vanlue is : "+min);
		
		//		Problem no. 8
	}

}
