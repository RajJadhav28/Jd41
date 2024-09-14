package Java8features;

interface A11{
	public void add(int a, int b);
}
public class Pro3 {
	public static void main(String[] args) {
		A11 obj=(a,b)->{System.out.println(a+b);};
		obj.add(10, 20);
		

	}

}
