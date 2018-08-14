import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double number1, number2;
		String text;
		
		//prompt for entering the numbers 
		System.out.println("Enter the commands and two numbers to do some operations:\n");
		
		//Assign the variables and take the inputs
		text = input.nextLine();
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		
		//write switch statement for the text
		switch(text){
			case "ADD":
			{
				System.out.println("Addition = " + (number1+number2));
				break;
			}
			case "SUBTRACT":
			{
				System.out.println("Subtraction = " + (number1-number2));
				break;
			}
			case "MULTIPLY":
			{
				System.out.println("Multiplication = " + (number1*number2));
				break;
			}
			case "DEVIDE":
			{
				System.out.println("Division = " + (number1/number2));
				break;
			}
			default:
			{
				System.out.println("Wrong input.Please tryt again with correct input.");
				break;
			}
		}
	}

}
