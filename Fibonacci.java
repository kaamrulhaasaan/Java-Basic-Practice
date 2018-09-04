import java.util.Scanner;

/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class Fibonacci {

	public static void main(String[] args) {
		//this is a simple java program to print a fibonacci series
		
		//declare variables first
		int a = 0, b = 1, c = 0 , number, count = 0 ;
		//create a Scanner object to take input
		
		Scanner input = new Scanner(System.in);
		
		//take the input
		number = input.nextInt();
		
		if(number>2){
			count = 2;
			System.out.print(a+"   "+b+"   ");
		}
		else if(number == 1){
			count = 1 ;
			System.out.print(a);
		}
		else if(number == 0){
			System.out.println("You have inputted zero.Please input a value greater than zero.");
		}
		
		//write the logic part here
		
		for(int i = 1 ; i <= number; i++){
			c = a + b ;
			a = b ;
			b = c ;
			
			if(count < number){
				System.out.printf("%d   ",c);
				count++;
			}
		}
		
		//if you want to check the value of count then remove the comment below.
		//System.out.println("\n"+count);
	}

}
