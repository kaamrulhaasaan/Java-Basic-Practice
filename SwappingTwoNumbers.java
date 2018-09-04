import java.util.Scanner;

/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		//this is a simple java program to swap two numbers or two variables
		
		//declare variables first
		int a, b ;
		
		//create a scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//take the inputs
		a = input.nextInt();
		b = input.nextInt();
		
		//print the given numbers
		System.out.println("Before Swapping, the numbers are: "+a+" and "+b);
		
		//now this is the logic part of this program
		a = a + b ;
		b = a - b ;
		a = a - b ;
		
		//print the result!!
		System.out.println("After Swapping, the numbers are: "+a+" and "+b);
	}

}
