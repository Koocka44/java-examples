package basics.impl;

public class LineReader {
	
	public static void readLines() {
		StringBuilder sb = new StringBuilder();
		String a;
		while(!(a = System.console().readLine()).equals("")){
			sb.setLength(0);
			String[] words = a.split(" ");
			for(int i = words.length-1; i >= 0; i--) {
				sb.append(words[i] + " ");
			}
			System.out.format("The typed line backwards: %s\n", sb.toString());
		}
		System.out.println("Empty string entered, exiting.");
	}
	
}