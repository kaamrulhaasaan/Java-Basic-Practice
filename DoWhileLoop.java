import java.util.Scanner;

/*
 	This is a simple java program for do....while lopp
 	Author: Md. Kamrul Hasan
 	CSE, 13th Batch, PSTU
 */
public class DoWhileLoop {

	public static void main(String[] args) {
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//declare variable
		int i = 1 , n ;
		
		/*In this program, we are going to print Java is fun 
		atleast one time.You can print more than one time by entering 
		the value of n.
		*/
		
		//prompt user to enter the value of n
		System.out.println("How many times you wanna print??\n");
		n = input.nextInt();
		
		do{
			System.out.println("Java is fun\n");
			i++;
		}while(i <= n);
		
		/*In this program, you will get atleast one output.Because, 
		 * the loops body is executed before checking the condition.*/ 
	}

}
