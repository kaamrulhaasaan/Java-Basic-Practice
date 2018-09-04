import java.util.Scanner;

/*
 * This is a simple java program to understand array
 * Author: Kamrul Hasan
 * 13th batch,PSTU
 */
public class PalindromeNumber {
	public static void main(String args[]){
		/*This is a simple java program to check a number is 
		 * palindrome or not. 
		 */
		//take variables first
		int number, reminder = 0, mod, temp ;
		
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//take the input
		number = input.nextInt();
		
		//we have the number now.So we need to write the logic part
		//here
		
		temp = number; /*we will need the initial value of number
						when we check number == reminder or not.If
						we work with number instead of temp within
						the while loop the value will be 0 after ending
						the loop.So we will not get the initial value 
						of number to compare with the reminder.
						*/
		while(temp != 0){
			mod = temp % 10;
			temp = temp / 10;
			reminder = reminder * 10 + mod ;

		}
		/*after ending the loop, we are getting the value of temp 
		 * equal zero.But the value of number is totally unchanged!!
		 * that's what we need!!You can check the value of temp by
		 * removing the comment below.
		 */
		/*System.out.println(number);
		System.out.println(temp);*/
		
		if(number == reminder){
			System.out.println(number +" is a palindrome number.\n");
		}
		else{
			System.out.println(number +" is not a palindrome number.\n");
		}
	}
}
