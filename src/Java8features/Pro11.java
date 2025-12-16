package Java8features;


interface A12{
	public void show();
}
public class Pro11 {
	public static void main(String[] args) {
		A12 obj=()->{
			System.out.println("I am show method");
		};
		obj.show();
	}
}
