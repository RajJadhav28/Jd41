package Java8features;

import java.util.Arrays;
import java.util.List;

public class Pro15 {
	public static void main(String[] args) {
		List as= Arrays.asList(10,20,30,40,50);
		as.forEach((n)->System.out.println(n));;

	}

}
