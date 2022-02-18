package FileHandling;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("/Users/lilli/Desktop/Filef1.txt");
			myWriter.write("Java is the prominent programming language of the millenium.");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} 	catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}

}
