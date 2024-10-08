package FileHandling1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String s=sc.nextLine();
		String path="C:\\Users\\HP\\OneDrive\\Desktop\\FileHandling\\File3.txt";
		FileWriter writer;
		FileReader reader;
		try {
			writer =new FileWriter(path,true);
			writer.write(s);
			writer.flush();
			reader =new FileReader(path);
			int c=reader.read();
			while(c!=-1) {
				System.out.print((char)c);
				c=reader.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
