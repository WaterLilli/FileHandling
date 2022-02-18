package FileHandling;

import java.io.File;			//Import the File Class
import java.io.IOException;		//Import the IOExpections class to handle errors

public class CreateFile { 

	public static void main(String [] args) {
		try {
			File myObj = new File("/Users/lilli/Desktop/File0.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " +myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		 } catch (IOException e) {
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		 }
		
	}
}
