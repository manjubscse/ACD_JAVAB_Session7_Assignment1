import java.util.Scanner;
public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialized Scanner object
		Scanner input =new Scanner(System.in);
		
		System.out.println("Please Enter Integer Value");
		// initialize integer variable
		int integer = input.nextInt();
		
		// initialize string variable
		String string;
		// converting integer to string using valueOf function
		
		string = String.valueOf(integer);
		
		System.out.println("String Result : "  + string);
		// prints 5345

		input.close();
	}

}
