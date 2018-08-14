
public class Loops {

	public static void main(String[] args) {
		/*boolean check1 = 4<5;
		boolean check2 = 5<4;
		
		System.out.println(check1);
		System.out.println(check2);*/
		
		int value = 0;
		
		while(value < 10)   //the condition closed by the first bracket is used to stop the loop
		{
			System.out.println("Hello");  //this will print Hello 10 times.
			value = value + 1; //this will upgrade the value
		}
		
		System.out.println("\n\n");
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Hello");
		}
	}

}
