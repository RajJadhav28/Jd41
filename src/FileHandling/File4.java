package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File4 {
	public static void main(String[] args) {
		String path="D:\\FileHandling\\File3.txt";
		File file=new File(path);
		FileReader reader;
		try {
			reader=new FileReader(path);
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
