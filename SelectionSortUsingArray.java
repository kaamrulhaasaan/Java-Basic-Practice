import java.util.Scanner;

/*
 * Author: Kamrul Hasan 
 * CSE 13th batch,PSTU
 */

/*
 * this is a simple java program for selection sort algorithm
 */
public class SelectionSortUsingArray {

	public static void main(String[] args) {
		//declare variables first
		int n, i, j, temp ;
		
		//create Scanner object to take input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		n = input.nextInt();
		
		//declare array type reference variable
		int[] numbers;
		numbers = new int[n];
		
		System.out.println("Enter the values: ");
		for(i=0; i<n; i++){
			numbers[i] = input.nextInt();
		}
		
		System.out.print("Array before sorting: ");
		for(i=0; i<n; i++){
			System.out.print(numbers[i] +" ");
		}
		
		//here is the logic part
		for(i=0; i<n-1; i++){
			for(j=i+1; j<n; j++){
				if(numbers[i]>numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		System.out.print("\n");
		System.out.print("Array after sorting: ");
		for(i=0; i<n; i++){
			System.out.print(numbers[i]+" ");
		}
	}

}
