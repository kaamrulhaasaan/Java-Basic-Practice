import java.util.Scanner;

/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class ReversingNumber {

	public static void main(String[] args) {
		//this is a simple java program to reverse a number
		
		//declare variables first
		int number, temp, rem = 0, mod ;
		
		//create a Scanner object to take the value
		Scanner input = new Scanner(System.in);
		
		//take the value
		number = input.nextInt();
		
		//here is the logic part
		temp = number;
		while(temp != 0){
			mod = temp % 10 ;
			temp = temp / 10 ;
			rem = 10*rem + mod ;
		}
		System.out.println(rem);
	}

}
