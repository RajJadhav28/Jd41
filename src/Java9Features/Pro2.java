package Java9Features;

interface I3{
	public static void call() {
		sum(10,20);
	}
	private static void sum(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
}
class B1 implements I3{
	public void sub(int a, int b) {
		System.out.println("Subtraction:"+(a-b));
	}
}
public class Pro2 {

	public static void main(String[] args) {
		B1 obj=new B1();
		obj.sub(20, 10);
		I3.call();
	}

}
