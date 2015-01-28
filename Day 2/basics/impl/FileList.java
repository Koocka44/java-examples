package basics.impl;

import java.io.File;

public class FileList {
	
	public static void listFiles() {
		String path;
		StringBuilder sb = new StringBuilder();
		System.out.println("Please enter path:");
		if(!(path = System.console().readLine()).equals("")){
			File dir = new File(path);
			
			if(dir.exists()){
				String[] files = dir.list();
				for(String file : files){
					if(file.endsWith(".java")){
						sb.append(file + "\n");
					}
				}
				System.out.println("List of .java files in " + path + ":\n" + sb.toString());
			}
			else {
				System.out.println("The specified path does not exist!");
			}
		}
		else {
			System.out.println("Empty string entered, exiting.");
		}
		System.out.println("listFiles() method finished running.");
	}
	
}