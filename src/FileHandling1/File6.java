package FileHandling1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File6 {
	public static void main(String[] args) {
		String path="/home/student/Desktop/Raj41/file6.txt";
		String path1="/home/student/Desktop/Raj41/file5.txt";
		
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
