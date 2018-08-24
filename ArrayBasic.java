/*
 * This is a simple java program to understand array
 * Author: Kamrul Hasan
 * 13th batch,PSTU
 */
public class ArrayBasic {

	public static void main(String[] args) {
		//declare reference variable for storing values
		int[] values;
		// int[] values will hold some memory for the values but 
		//we do not know how much the memory needed.So we need to 
		//declare the length of the array
		
		values = new int[10];
		//this line express the size or length of the array
		
		//now if i print the values then i will get 0 for every 
		//index.
		//Cause java initialize the values by zero.Lets check
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		//we can declare the values by assigning 
		values[0]=1;
		values[1]=2;
		values[2]=3;
		values[3]=4;
		values[4]=5;
		values[5]=6;
		values[6]=7;
		values[7]=8;
		values[8]=9;
		values[9]=10;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		System.out.println(values[4]);
		System.out.println(values[5]);
		System.out.println(values[6]);
		System.out.println(values[7]);
		System.out.println(values[8]);
		System.out.println(values[9]);
		
		//we can assigning the values in another way too
		int[] numbers = {1,2,3,4,5,6};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		
		//we need to use for loop for reduce typing!!
		for(int i=0; i<values.length; i++){
			System.out.println(values[i]);
		}
		
		System.out.println("\n\n");
		
		for(int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}

}
