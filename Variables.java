
public class Variables {

	public static void main(String[] args) {
		//Declaring variable
		//these variables are java primitive type variables
		int myNumber; //32 bit
		short myShort; //16 bit
		long myLong; //64 bit
		double myDouble;
		float myFloat;
		char myChar;
		boolean myBool;
		byte myByte;
		
		//these are non-primitive type variables
		String myString = "Hello"; //String is actually a class
		String blank = " ";
		String name = "Johny";
		String greeting = myString + blank + name;   //String can be added directly
		
		//initializing variable
		myNumber = 8888;
		myShort = 247;
		myLong = 43434;
		myDouble = 7.34;
		myFloat = 2.35f;  //f must be used
		myChar = 'K';     /*character should be closed by a single quotation
						  must be single character*/
		myBool = false;   // boolean should be true or false
		myByte = 127;     /* 8 bit
						  can be positive or negative number*/
		
		//print output
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBool);
		System.out.println(myByte);
		
		System.out.println(myString);
		System.out.println(greeting);
		System.out.println("Hello" + " " + "Johny");  //same output as greeting
		System.out.println("Value is " +myDouble); //this is concatenation
		System.out.println("Values are " +myNumber+ "and" +myShort); //this is concatenation too.
	}
}
