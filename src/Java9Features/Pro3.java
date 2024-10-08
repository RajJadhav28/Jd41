package Java9Features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro3 {
//try with resources
	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter name:");
			String pin = br.readLine();
			System.out.println("Your code is :"+pin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
