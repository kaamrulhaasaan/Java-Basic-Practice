import java.util.Scanner;

/*This is a simple java program to make a calculator 
 * without using switch..case statement
 */

public class CalculatorUsingIfElse {

	public static void main(String[] args) {
		//create a Scanner object to take inputs
		Scanner input = new Scanner(System.in);
		
		//declare variables
		String command;
		double number1, number2;
		
		System.out.println("Enter the commands and two numbers to do some operations:\n");
				
		//Assign the variables and take the inputs
		command = input.nextLine();
		
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		
		//We have taken the input values.Now we need to do the operations as requested.
		//For this, we will use if, else if and else statement
		
		if(command.equals("ADD")) //if(command=="ADD") will not work.because == checks the actual object references are the same or not		
		{
			System.out.println("Addition = " + (number1 + number2));
		}
		else if(command.equals("SUBTRACT"))
		{
			System.out.println("Subtraction = " + (number1 - number2));
		}
		else if(command.equals("MULTIPLY"))
		{
			System.out.println("Multipliaction = " + (number1 * number2));
		}
		else if(command.equals("DIVIDE"))
		{
			System.out.println("Division = " + (number1 / number2));
		}
		else
		{
			System.out.println("Wrong command.Please enter ADD,SUBTRACT,MULTIPLY or DIVIDE to do the operation.\n");
		}
	}

}
