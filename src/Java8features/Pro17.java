package Java8features;

import java.util.Arrays;
import java.util.List;

public class Pro17 {

	public static void main(String[] args) {
		List as=Arrays.asList("A","B","C","D");
		as.forEach((n)->System.out.println(n));

	}

}
