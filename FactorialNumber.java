import java.util.Scanner;

/*
 * This is a simple java program to understand array
 * Author: Kamrul Hasan
 * 13th batch,PSTU
 */
public class FactorialNumber {

	public static void main(String[] args) {
		//this is a simple java program to determine factorial of a given number
		
		//declare the variables first
		int number, i, temp = 1 ;
		
		//create a scanner object to take the input
		Scanner input = new Scanner(System.in);
		
		//take the input and store the value
		number = input.nextInt();
		
		//now the logic part
		
		for(i=1; i<=number; i++){
			temp = temp * i ;
		}
		System.out.println(temp);
	}
}
