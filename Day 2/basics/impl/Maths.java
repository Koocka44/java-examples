package basics.impl;

public class Maths {
	
	public static void doMaths() {
		String input;
		System.out.println("Please enter number:");
		while(!(input = System.console().readLine()).equals("END")){
			double number = Double.parseDouble(input);
			System.out.println("sin(" + number + ") = " + Math.sin(number));
			System.out.println("cos(" + number + ") = " + Math.cos(number));
			System.out.println("tan(" + number + ") = " + Math.tan(number));
			System.out.println("Please enter number:");
		}
		System.out.println("END input, doMaths() method finished running.");
	}
	
}