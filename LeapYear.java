import java.util.Scanner;

/*
 * This is a simple java program to understand array
 * Author: Kamrul Hasan
 * 13th batch,PSTU
 */
public class LeapYear {
	public static void main(String[] args) {
		//This is a simple java program to check an year is a leap year or not
		
		//declare variables first
		int year ;
		
		//create a scanner object to take the input
		Scanner input = new Scanner(System.in);
		
		//take the input
		year = input.nextInt();
		
		//here is the logic part
		
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 )){
			System.out.println(year +" is a leap year.");
		}
		else{
			System.out.println(year +" is not a leap year.");
		}
	}

}
