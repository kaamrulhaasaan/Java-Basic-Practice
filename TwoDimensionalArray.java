
/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*
		 * this is a simple java program to understand 2
		 * dimensional array.
		 */
		//firstly declare the array type reference variable
		int[][] matrix = {
				{3,4,5},{2,3,6,7}
		};
		
		/*
		 * that means we are assigning matrix[0][0]=3.
		 * matrix[0][1]=4, matrix[0],[3]=5 and so on
		 */
		System.out.print(matrix[0][0] + "\t");
		System.out.print(matrix[0][1] + "\t");
		System.out.print(matrix[0][2]);
		System.out.print("\n");
		System.out.print(matrix[1][0] + "\t");
		System.out.print(matrix[1][1] + "\t");
		System.out.print(matrix[0][2]);
		System.out.println("\n");
		
		/*
		 * that means we have rows and columns in 2 d array.
		 */
		//lets look at another example
		String[][] text = new String[2][2];
		text[0][0] = "Hello,";
		text[0][1] = "This";
		text[1][0] = "is";
		text[1][1] = "Kamrul Hasan";
		
		System.out.println(text[0][0]);
		System.out.print(text[0][1] + " " + text[1][0] + " " + text[1][1]);
		
	}

}
