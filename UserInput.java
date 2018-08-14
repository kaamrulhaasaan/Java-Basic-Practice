import java.util.Scanner;

public class UserInput {
	public static void main(String arg[]){
		
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user to input a line of text
		System.out.println("Enter a line of text: \n");
		
		//take a String type variable to get the line of text as 
		//input and assign it as input.nextLine()
		String line = input.nextLine();
		
		//Show the output
		System.out.println("\nYou have entered: \n" + line);
	}
}
