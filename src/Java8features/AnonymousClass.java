package Java8features;


interface A10{
	public void show();
}
public class AnonymousClass {

	public static void main(String[] args) {
		A10 obj=new A10() {
			public void show() {
				System.out.println("I am show method");
			}
		};
		obj.show();

	}

}
