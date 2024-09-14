package Java8features;

interface AC{
	public int add(int a, int b);
}
public class Pro8 {

	public static void main(String[] args) {
		AC obj=(int a, int b)->{return a+b;};
		int c=obj.add(10, 20);
		System.out.println(c);

	}

}
