import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt for user input 
		System.out.println("Enter a line of text to control the machine.\n");
		
		//enter the text
		String text = input.nextLine();
		
		//create a switch statement for text
		switch(text){
			case "start":
			{
				System.out.println("\nMachine Started!!\n");
				break;
			}
			case "stop":
			{
				System.out.println("Machine Stopped!!\n");
				break;
			}
			case "speed up":
			{
				System.out.println("Speed increased!!\n");
				break;
			}
			case "speed down":
			{
				System.out.println("Speed Decreased!!");
				break;
			}
			default:
			{
				System.out.println("Wrong input.Please try again.");
				break;
			}
		}
	}

}
