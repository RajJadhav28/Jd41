package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) {
		String path="D:\\FileHandling\\File3.txt";
		FileReader reader;
		try {
			reader=new FileReader(path);
			System.out.println((char)reader.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
