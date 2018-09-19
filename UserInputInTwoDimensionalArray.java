import java.util.Scanner;

/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class UserInputInTwoDimensionalArray {

	public static void main(String[] args) {
		/*
		 * This is a simple java program to take input and print
		 * the output in screen using two dimensional array
		 */
		//lets declare variables first
		int row, col ;
		
		//we need to create a Scanner object to take the value of
		//row and column
		Scanner input = new Scanner(System.in);
		row = input.nextInt();
		col = input.nextInt();
		
		//now we need to declare array type reference variable
		int[][] numbers = new int[row][col];
		
		//we can use a for loop to take the values now
		for(row = 0; row<numbers.length; row++){
			for(col = 0; col<numbers[row].length; col++){
				numbers[row][col] = input.nextInt();
			}
		}
		
		//we have successfully inputed the values
		//now we need to print the values in screen.
		//for this, we will use another for loop
		for(row=0; row<numbers.length; row++){
			for(col=0; col<numbers[row].length; col++){
				System.out.print(numbers[row][col] + "\t");
			}
			System.out.println("");
		}
	}

}
