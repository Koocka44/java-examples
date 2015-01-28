package basics.impl;

public class FolderContents {
	
	public static void printFolderContents(String path) {
		File f = new File(path);	
		System.out.println(f.getName());
		if(file.isDirectory()){
			File[] list = f.listFiles();
			for(File file : list){
				printFolderContents(file.getAbsolutePath());
			}
		}
	}
}