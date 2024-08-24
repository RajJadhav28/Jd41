package FileHandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the sentence:");
//		String s=sc.nextLine();
		
		String path="D:\\FileHandling\\File6.txt";
		FileWriter writer=null;
		BufferedWriter bf=null;
		try {
			writer =new FileWriter(path);
			bf=new BufferedWriter(writer);
			bf.write("usa");
			bf.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}

	}

}
