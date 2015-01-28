package basics.impl;

public class Pwd {
	
	public static void printWorkingDirectory() {
		String pwd = System.getProperty("user.dir");
		System.out.println("Working Directory = " + pwd);
	}
}