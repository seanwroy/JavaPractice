package Exercise7;
import java.util.Scanner;

public class LinePlay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Lotto ticket = new Lotto();
		
		System.out.println("How many lines would you like to play?");
		int numberOfLines = input.nextInt();
		
		//Sets numbers for each array depending on number of lines
		for(int i = 1; i <= numberOfLines; i++) {
			ticket.setNumbers();		
			System.out.println("Line " + i + ": " + ticket.toString());
		}
		
		input.close();
	}
}
