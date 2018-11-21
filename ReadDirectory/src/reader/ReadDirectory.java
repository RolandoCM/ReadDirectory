package reader;

import java.io.File;

public class ReadDirectory {
	public static void main (String [] args) {
		File folder = new File(args[0]);
		String[] files = folder.list();
		
		for(String file : files) {
			System.out.println(file);
		}
	}

}
