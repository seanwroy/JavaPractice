import java.util.Scanner;

public class GreatestCommonFactor {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Try-Catch block that uses the BadSumException exception and a general exception
	try {
		System.out.println("Input two integers: ");
		String one = input.nextLine();
		String two = input.nextLine();
		
		//Parsing String inputs as Ints
		int number1 = Integer.parseInt(one);
		int number2 = Integer.parseInt(two);
		
		if (number1 < 0 || number2 < 0) {
			System.out.println("You cannot use negative numbers!");
		} else {
			System.out.println("The Greatest Common Factor of " + number1 + " and " + number2 + " is " + GCF(number1, number2));
		}
	} catch(BadSumException e) {
		System.out.println(e);
	} catch(Exception e) {
		System.out.println("Entered values could not be parsed as integers.");
	}
	
	input.close();
}

//Method for finding the greatest common factor
public static int GCF(int a, int b) throws BadSumException {
	int factor = Math.max(a, b);
	   for(int i = factor; i > 0; i--){
	      if(a % i == 0 && b % i == 0){
	         return i;
	      }
	   }
	   return -1;
	}
}
