package FileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File6 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    float f = sc.nextFloat();
	    String path = "D:\\FileHandling\\File5.txt";
	    
	    // Automatically closes the writer
	    try (PrintWriter writer = new PrintWriter(path)) {
	        writer.print(f);
	    } catch(FileNotFoundException e) {
	        System.err.println("Error: Could not create file at " + path);
	        e.printStackTrace();
	    }
	}

}
