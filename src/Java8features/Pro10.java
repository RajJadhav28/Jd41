package Java8features;

import java.util.Arrays;
import java.util.List;

public class Pro10 {
	public static void main(String[] args) {
		List ls=Arrays.asList(10,20,30,40,50,60);
		ls.forEach((n)->System.out.println(n));
	}

}
