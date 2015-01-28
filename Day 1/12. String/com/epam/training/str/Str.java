package com.epam.training.str;

public class Str {
	
    public static void main(String[] args){
		System.out.println(Str.firstCap(args[0]));
		String encoded = Str.encode(args[0],args[1].charAt(0));
		System.out.println("Encoded: " + encoded);
		System.out.println("Decoded:"+Str.encode(encoded,args[1].charAt(0)));
    }
	
	private static String firstCap(String str){
		char first = str.charAt(0);
		String rem = str.substring(1);
		String ret = Character.toUpperCase(first) + rem;
		
		return ret;
	}
	
	private static String encode(String str, char ch2){
		String result = "";
		for(int i = 0; i< str.length(); i++){
			char ch1 = str.charAt(i);
			char ch3 = (char) (ch1 ^ ch2);
			result = result + ch3;
		}
		
		return result;
	}
	
}