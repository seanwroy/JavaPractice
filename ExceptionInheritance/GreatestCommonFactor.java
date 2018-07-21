package JavaSemester2;
import java.util.Scanner;

public class GreatestCommonFactor {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	try {
		System.out.println("Input two integers: ");
		String one = input.next();
		String two = input.next();
		
		int number1 = Integer.parseInt(one);
		int number2 = Integer.parseInt(two);
	    
		System.out.println("The Greatest Common Factor of " + number1 + " and " + number2 + " is " 
		+ GCD(number1, number2));
	} catch(BadSumException e) {
		System.out.println(e);
	} catch(Exception e) {
		System.out.println("Entered values could not be parsed as integers.");
	}
	
	input.close();
}

public static int GCD(int a, int b) throws BadSumException {
	int r;
	if(b == 0) {
		throw new BadSumException("Must use numbers larger than zero");
	} else {
		r = a % b;
        a = b;
        b = r;
        
        return a;
	}	
}
}
