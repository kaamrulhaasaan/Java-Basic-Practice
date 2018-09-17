import java.util.Scanner;
/*
 * Author: Kamrul Hasan
 * CSE 13th batch,PSTU
 */
public class TakingStingAsInput {

	public static void main(String[] args) {
		/*
		 * this is a simple java program to take Sting
		 * as input and print them
		 */
		
		/*
		 * We should remember that String is not a primitive type 
		 * variable in java.String is a reference Class actually.
		 * Look carefully, the S of String is in upper case like 
		 * the first letter of any class.Primitive type variables
		 * start with lower case letter.So what is going here?basically,
		 * String refers a class and hold "enough" space in memory unlike
		 * primitive type.Look the example below- 
		 */
		int number = 0;
		String[] line = null;
		
		/*
		 * int is primitive type.So it will hold some memory with
		 * its range.We will not able to assign int type variable with
		 * values out of these range.
		 * the default value of int is 0 in java and it should be 
		 * initialized first.
		 */
		
		/*
		 * Now, String line means line is a String type class.It holds
		 * enough space in memory.
		 * and the funny part is, line should be initialized as "null" not "0" by default.
		 * that means if you print line now you will see "null" written in
		 * the console.remove the // from the line below and check that.
		 */
		//System.out.println(line);
		
		/*
		 * now we will declare an array type String class and take
		 * input as string.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many strings you want to enter?");
		
		int t;
		
		t = input.nextInt();
		
		String[] texts = new String[t];
		
		for(int i=0; i<t; i++){
			texts[i] = input.next();
		}
		//print the Strings
		for(int i=0; i<t; i++){
			System.out.println(texts[i]);
		}
	}
}
