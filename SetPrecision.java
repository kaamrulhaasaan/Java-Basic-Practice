import java.util.Scanner;

public class SetPrecision {

	public static void main(String[] args) {
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		//declare two variables
		double number1, number2, sum;
		
		//prompt for entering the values
		System.out.println("Enter the values of the two numbers: \n");
		
		//take the inputs
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		sum = number1 + number2;
		
		System.out.printf("%.2f", sum);
		
	}

}
