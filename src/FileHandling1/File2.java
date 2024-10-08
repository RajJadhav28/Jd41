package FileHandling1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String s=sc.nextLine();
		String path="C:\\Users\\HP\\OneDrive\\Desktop\\FileHandling\\File2.txt";
		FileWriter writer;
		try {
			writer =new FileWriter(path,true);
			writer.write(s);
			writer.flush();
			if(writer!=null) {
				System.out.println("String added successfully.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
		}
		

	}

}
