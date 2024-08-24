package FileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer:");
		float f=sc.nextFloat();
		String path="D:\\FileHandling\\File5.txt";
		PrintWriter writer=null;
		try {
			writer =new PrintWriter(path);
			writer.print(f);
			writer.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}

	}

}
