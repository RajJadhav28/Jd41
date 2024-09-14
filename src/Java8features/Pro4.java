package Java8features;

interface A13{
	public int add(int a, int b);
}
public class Pro4 {

	public static void main(String[] args) {
		A13 obj=(int a, int b)->{return a+b;};
		System.out.println(obj.add(10, 20));

	}

}
