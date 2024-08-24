package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		String path="D:\\FileHandling\\File2.txt";
		File file=new File(path);
		FileWriter writer;
//		System.out.println(file.exists());
//		System.out.println(file.canRead());
//		System.out.println(file.getName());
//		System.out.println(file.getParent());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			file.mkdir();
		}catch(Exception e) {
			e.printStackTrace();
		}
		String []list=file.list();
//		for(String s:list) {
//			System.out.println(s);
//		}
		System.out.println(file.delete());
		try {
			writer=new FileWriter(path);
			writer.write("Hello Students");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
