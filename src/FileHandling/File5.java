package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File5 {

	public static void main(String[] args) {
		String path="C:\\Users\\HP\\OneDrive\\Desktop\\FileHandling\\File3.txt";
		String path1="C:\\Users\\HP\\OneDrive\\Desktop\\FileHandling\\File3.txt";
		
		FileReader reader=null;
		FileWriter writer=null;
		
		try {
			reader=new FileReader(path);
			writer=new FileWriter(path1);
			//Read the char from data
			int c=reader.read();
			while(c!=-1) {
				writer.write(c);
				c=reader.read();
			}
			writer.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
