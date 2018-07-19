import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class FindingSum {

	public static void main(String[] args) {
		/*Write a program that randomly generates 2 integers and prompts the user for their sum. 
		The program will store all wrong answers from the user into an ArrayList. If the user 
		enters the same answer twice, they will get the following message:*/ 
		int num1 = (int)(Math.random() * 100);
		int num2 = (int)(Math.random() * 100);
		
		//Program code is in userGuess method
		userGuess(num1, num2);
		
	}
	
	private static void userGuess(int num1, int num2) {
		int result = num1 + num2;
		int sum = 0;
		
		ArrayList<Integer> wrong = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		//While sum is not equal to result, loop stores guesses in array titled 'wrong'
		do {
			//Program closes if user uses input that is not an Int
			try {
				System.out.println("What is " + num1 + " + " + num2 + "?");
				sum = input.nextInt();
			} 
			catch (InputMismatchException e){
				System.out.println("Please enter integers only! Closing program...");
				System.exit(1);
			}
			
			if (sum != result) {
				//checks if sum is already stored in the array
				if(wrong.contains(sum)) {
					System.out.println("You've already entered " + sum + ". Try again!");
				}
				else {
					System.out.print("Wrong, try again! ");
					//Adds sum to the array if it isn't there already
						wrong.add(sum);
				} 
			} 
		} while(sum != result); 
		
		//Program finishes with correct answer
		System.out.println("Correct answer!");
		input.close();
		
	}
}
		


