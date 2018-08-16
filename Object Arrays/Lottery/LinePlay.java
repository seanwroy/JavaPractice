package Lottery;

import java.util.ArrayList;
import java.util.Scanner;

public class LinePlay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Lotto ticket = new Lotto();
		ArrayList<Lotto> Lottery = new ArrayList<Lotto>();
		
		System.out.println("How many lines would you like to play?");
		int numberOfLines = input.nextInt();
		
		//Sets numbers for each array depending on number of lines
		for(int i = 1; i <= numberOfLines; i++) {
			Lotto line = new Lotto();
			Lottery.add(line);
		}
		
		//Every line calls toString constructor in Lotto
		for(Lotto line : Lottery) {
			System.out.println("Line: " + line.toString());
		}
		
		input.close();
	}
}
