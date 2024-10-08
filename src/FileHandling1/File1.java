package FileHandling1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine();
		String path="C:\\Users\\HP\\OneDrive\\Desktop\\FileHandling\\file1.txt";
		
		FileWriter writer;
		try {
			writer =new FileWriter(path,true);
			writer.write(s);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
