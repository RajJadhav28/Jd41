package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File18 {

	public static void main(String[] args) {
		String path="D:\\FileHandling\\File9.txt";
		FileReader reader=null;
		BufferedReader reader2=null;
		try {
			reader=new FileReader(path);
			reader2=new BufferedReader(reader);
			String line=reader2.readLine();
			int count=0;
			int sum=0;
			while(line!=null) {
				count++;
				int l=line.length();
				sum+=l;
				line=reader2.readLine();
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
