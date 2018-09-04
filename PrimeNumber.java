import java.util.Scanner;

/*
 * This is a simple java program to understand array
 * Author: Kamrul Hasan
 * 13th batch,PSTU
 */
public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * this is a simple java program to check a number prime 
		 * or not.
		 */
		//declare a variable first to hold some memory for storing the value
		int number;
		
		//create a scanner object to take the input
		Scanner input = new Scanner(System.in);
		
		//take the input and store the value to the variable
		number = input.nextInt();
		
		/*now we have got the value to check it is prime or not
		 *we need to write the logic part here.we will need an extra variable
		 *for our checking purpose.
		*/
		int count = 0 ;
		for(int i=2; i<=number/2; i++){
			if(number % i == 0){
				count++;
			}
		}
		if(count == 0 && number != 1){
			System.out.println(number +" is a prime number.\n");
		}
		else{
			System.out.println(number +" is not a prime number.\n");
		}
	}

}
