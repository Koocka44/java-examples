package basics.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtils {
	
	public static void containingLines(String path, String data) {
		BufferedReader br = null;
		
        try {
			br = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = br.readLine()) != null) {
				if(line.contains(data)){
					System.out.println(line);
				}
            }
        } catch (FileNotFoundException|IOException e) {
            e.printStackTrace();
		} finally {
			if (br != null) {
				try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
			}
        }
		
	}
	
	public static void countOccurences(String path, String data) {
		BufferedReader br = null;

        try {
			br = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = br.readLine()) != null) {
				for(String word : line.trim().split("\\s+")){
					if(word.equals(data)){
						count++;
					}
				}
            }
			System.out.format("Occurences of %s in the file: %d",data,count);
        } catch (FileNotFoundException|IOException e) {
            e.printStackTrace();
		} finally {
			if (br != null) {
				try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
			}
        }
	}
	
	public static void writeLines() {
		System.out.print("Enter the name of the file:");
		PrintWriter pw = null;
		
        try {
            pw = new PrintWriter(path);
            while(!(line = System.console().readLine()).equals("")){
				pw.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
		finally {
            if (pw != null) {
				pw.close();
			}
        }
		
	}
	
	public static void printNLines(String path, int n) {
		BufferedReader br = null;
		
        try {
			br = new BufferedReader(new FileReader(path));
            String line = null;
			for(int i = 1; i <= n; i++ ){
				if ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
        } catch (FileNotFoundException|IOException e) {
            e.printStackTrace();
		} finally {
			if (br != null) {
				try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
			}
        }
		
	}
	
	public static void printNLines(String path) {
		printNLines(path, 5);
	}
}
