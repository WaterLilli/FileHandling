package FileHandling;

import java.io.File; //import the file class
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
	 public static void main(String[] args) {
	        try {
	            File myObj = new File("/Users/lilli/Desktop/NewFilef1.txt");
	            Scanner myReader = new Scanner(myObj);
	            while (myReader.hasNextLine()) {
	                String data = myReader.nextLine();
	                System.out.println(data);
	            }
	            myReader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("An error occured.");
	            e.printStackTrace();
	        }
	    }

}
