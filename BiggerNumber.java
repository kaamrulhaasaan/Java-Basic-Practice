import java.util.Scanner;

/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class BiggerNumber {

	public static void main(String[] args) {
		/*This is a simple java program to compare three integer
		numbers to find the largest number among them.
		*/
		
		/*firstly we need to declare three variable to hold some
		memory for storing the values of these numbers.So we are
		going to declare three variables.
		*/
		int num1, num2, num3;
		
		//now we need to create a scanner object to take the values
		Scanner input = new Scanner(System.in);
		
		//take the values now
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		/*we have taken the values of these numbers.now we need to
		 * write our logic for finding the largest number.And that is: 
		 */
		if(num1>num2 && num1>num3){
			System.out.println(num1 +" is the largest number.\n");
		}
		else if(num2>num1 && num2>num3){
				System.out.println(num2 +" is the largest number.\n");
			}
		else if(num3>num1 && num3>num2){
			System.out.println(num3 +" is the largest number.\n");
		}
		else{
			System.out.println("They are equal.\n");
		}
	}

}
