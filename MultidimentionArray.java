
public class MultidimentionArray {

	public static void main(String[] args) {
		
		int [][]arr;
		arr= new int[3][3];
		arr[0][0]=23;
		arr[0][1]=23;
		arr[0][2]=23;
		arr[1][0]=24;
		arr[1][1]=25;
		arr[1][2]=26;
		arr[2][0]=28;
		arr[2][1]=29;
		arr[2][2]=22;
		System.out.println("The array is: ");
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println(arr.length);
	}

}
