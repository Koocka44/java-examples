package com.epam.training.quadratic;

public class Quadratic {
	
    public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double[] result = Quadratic.sqroots(a,b,c);
        
		if(result.length == 0){
			System.out.println("a = 0 or discriminant is negative!");
		}
		else if(result.length == 1){
			System.out.println("There is one root:" + result[0]);
		}
		else{
			System.out.println("There are two roots: " + result[0] + ", " + result[1]);
		}
    }
	
	private static double[] sqroots(final double a, final double b, final double c) {
		
		double[] result = new double[0];
		if(a != 0){
			int discriminant = (b * b) - (4 * a * c);

			if(discriminant == 0) {
				result = new double[1];
				result[0] = (-1*b + Math.sqrt(discriminant))/ (2 * a);
				System.out.println(result[0]);
			}
			else if(discriminant >  0){
				result = new double[2];
				result[0] = (-1*b + Math.sqrt(discriminant))/ (2 * a);
				result[1] = (-1*b - Math.sqrt(discriminant))/ (2 * a);
			}
		}
		
		return result;
	}
	
}