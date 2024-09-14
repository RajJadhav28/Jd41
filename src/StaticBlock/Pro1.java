package StaticBlock;

public class Pro1 {
	static int a;
	static {
		 a=10;
		System.out.println("Method 1");
	}
	static {
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(a);
		
	}

}
