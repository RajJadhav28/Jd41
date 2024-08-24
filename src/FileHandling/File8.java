package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File8 {

	public static void main(String[] args) {
		String path="D:\\FileHandling\\File7.txt";
		
		File file=new File(path);
		FileReader reader=null;
		BufferedReader reader2=null;
			try {
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
