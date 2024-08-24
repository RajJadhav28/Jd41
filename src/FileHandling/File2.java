package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String s=sc.nextLine();
		String path="D:\\FileHandling\\File3.txt";
		File file=new File(path);
		FileWriter writer;
		try {
			System.out.println(file.exists());
			writer=new FileWriter(path);
			writer.write(s);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
