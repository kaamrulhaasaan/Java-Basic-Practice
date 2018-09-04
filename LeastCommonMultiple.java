import java.util.Scanner;

/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class LeastCommonMultiple {

	public static void main(String[] args) {
		//this is a simple java program to find lcm of two numbers
		
		//declare varibles first
		int num1, num2, gcd = 1, lcm ;
		
		//create a Scanner object to take inputs
		Scanner input = new Scanner(System.in) ;
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > 0 && num2 > 0){
			for(int i = 1 ; i <= num1 && i <= num2 ; i++){
				if(num1 % i == 0 && num2 % i == 0){
					gcd = i;
				}
			}
			lcm = (num1*num2)/gcd ;
			System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
		}
		else{
			System.out.println("Valulues must be greater than zero!!");
		}
	}

}
