package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File9 {

	public static void main(String[] args) {
		String path="D:\\FileHandling\\File9.txt";
		FileReader reader;
		BufferedReader reader1=null;
		try {
			reader=new FileReader(path);
			reader1=new BufferedReader(reader);
			String line=reader1.readLine();
			int count=0;
			while(line!=null) {
				System.out.println(line);
				if(!line.trim().isEmpty()) {//return true if the line is not empty
					count++;
				}
				line=reader1.readLine();
			}
			System.out.println("No.of line:"+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
