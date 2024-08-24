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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String s=sc.nextLine();
		
		String path="D:\\FileHandling\\File4.txt";
		String path1="D:\\FileHandling\\File4.txt";
		File file=new File(path);
		FileReader reader=null;
		FileWriter writer = null;
		BufferedReader reader2=null;
		BufferedWriter bf=null;
		
			try {
				writer=new FileWriter(path1);
				bf=new BufferedWriter(writer);
				bf.write(s);
				bf.flush();
				reader=new FileReader(path);
				reader2= new BufferedReader(reader);
				String line=reader2.readLine();
				int count=0;
				int sum=0;
				while(line!=null) {
					count++;
					int l=line.length();
					sum+=l;
					line=reader2.readLine();
				}
				System.out.println("Line:"+count);
				System.out.println("No. of char values:"+sum);

			}catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	

}
