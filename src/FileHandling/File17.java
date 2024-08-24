package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File17 {

	public static void main(String[] args) {
		String path="D:\\FileHandling\\File6.txt";
		FileReader reader=null;
		BufferedReader reader2=null;
		int c=0;
		try {
			reader =new FileReader(path);
			reader2=new BufferedReader(reader);
			String line=reader2.readLine();
			while(line!=null) {
				System.out.println(line);
				line=reader2.readLine();
				c++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("No.of lines:"+c);
		

	}

}
