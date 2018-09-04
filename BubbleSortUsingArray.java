import java.util.Scanner;

/*
 * This is a simple java program to understand array
 * Author: Kamrul Hasan
 * 13th batch,PSTU
 */
/*
 * this is a simple java program to sort the values of an array
 * from smaller number to bigger number.for this, we need to
 * a. declare array type reference variables
 * b. taking the inputs
 * c. sorting them using for loop
 */

public class BubbleSortUsingArray {

	public static void main(String[] args) {
		//declare variables
		int n, i, j, temp ;
		
		//n is the number of elements of the array.so we need to take
		//the value of n first.
		
		//create scanner object to take the input
		Scanner input = new Scanner(System.in) ;
		n = input.nextInt() ;
		
		//now declare the array type reference variable
		int[] numbers ;
		numbers = new int[n] ;
		
		//now take the values of the elements
		for(i = 0 ; i < n ; i++){
			numbers[i] = input.nextInt() ;
		}
		
		//Show the array before sorting
		System.out.print("Before Bubble Sorting: ");
		for(i = 0 ; i< n ; i++){
			System.out.print(numbers[i] + "  ");
		}
		
		//we have the values stored in memory now.
		//so we need to write the logic part here.
		//we have used bubble sort algorithm here!!
		for(i = n - 2 ; i >= 0 ; i--){
			for(j = 0 ; j <= i ; j++){
				if(numbers[j] > numbers[j+1]){
					temp = numbers[j] ;
					numbers[j] = numbers[j+1] ;
					numbers[j+1] = temp ;
				}
			}
		}
		System.out.print("\n");
		System.out.print("After buble sorting, we get:");
		for(i = 0 ; i < n ; i++){
			System.out.print(numbers[i] +"  ");
		}
	}
}
