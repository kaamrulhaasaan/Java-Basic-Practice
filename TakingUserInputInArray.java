import java.util.Scanner;

/*
 * This is a simple java program to understand array
 * Author: Kamrul Hasan
 * 13th batch,PSTU
 */

public class TakingUserInputInArray {

	public static void main(String[] args) {
		//declare reference variable to hold some memory spaces for the array list
		double[] numbers;
		numbers = new double[10];
		
		//create a Scanner object to take the inputs
		Scanner input = new Scanner(System.in);
		
		//take the values of the reference variable "numbers" from user
		for(int i=0; i<numbers.length; i++){
			numbers[i]=input.nextDouble();
		}
		
		//now print the output
		for(int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}

}
