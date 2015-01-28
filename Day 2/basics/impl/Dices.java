package basics.impl;

import java.util.Random;

public class Dices {
	
	public static void throwDice() {
		String input;
		Random rand = new Random();
		System.out.println("Please enter number of dices:");
		while(!(input = System.console().readLine()).equals("")){
			int numberOfDices = Integer.parseInt(input);
			for(int i = 1; i<=numberOfDices; i++){
				int result = rand.nextInt(6) + 1;
				System.out.println(i + ". dice: " + result);
			}
			System.out.println("Please enter number of dices:");
		}
		System.out.println("Empty input, throwDice() method finished running.");
	}
	
}