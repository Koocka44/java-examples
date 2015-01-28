package com.epam.training.euclid;

public class Euclid {
	
    public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int gcd = Euclid.greatestCommonDivisor(a,b);
        System.out.printf("The greatest common divisor of %d and %d is %d", a,b,gcd);
		
		gcd = Euclid.recursiveEuclid(a,b);
        System.out.printf("Recursively: The greatest common divisor of %d and %d is %d", a,b,gcd);
    }
	
	private static int greatestCommonDivisor(int a, int b){
		
		if(a == 0) {
			return b;
		}
		while(b != 0) {
			if(a > b) {
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		return a;
	}
	
	private static int recursiveEuclid(int a, int b)
	{
		if( b == 0 )		
			return a;
		else 
			return recursiveEuclid(b, a % b);
	}
	
}