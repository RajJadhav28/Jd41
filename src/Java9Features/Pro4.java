package Java9Features;

import java.util.List;

public class Pro4 {
//Factory method
	public static void main(String[] args) {
		List<String>list=List.of("Java","Spring","Hibernate","JSP");
		for(String l:list) {
			System.out.println(l);
		}

	}

}
