import java.util.Scanner;

/*
 * Author: Kamrul Hasan 
 * CSE 13th batch,PSTU
 */
public class LargestNumberOfAnArray {

	public static void main(String[] args) {
		//this is a simple java program to find the largest number from array
		
		//declare variables first
		int i, max, n;
		
		//create scanner object to take input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		n = input.nextInt();
		
		//declare array type reference variable
		int[] numbers;
		numbers = new int[n];
		
		System.out.println("Enter the values: ");
		for(i=0; i<n; i++){
			numbers[i]=input.nextInt();
		}
		
		//show the values
		System.out.print("The numbers are: " );
		for(i=0; i<n; i++){
			System.out.print(+numbers[i]+" ");
		}
		
		//let assign max=numbers[0] to compare each elements
		max = numbers[0];
		for(i=0; i<n; i++){
			if(max < numbers[i]){
				max = numbers[i];
			}
		}
		System.out.println("\n");
		System.out.println("The largest number is: "+max);
	}

}
