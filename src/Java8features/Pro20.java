package Java8features;

interface JavaInterface2{
	 int add(int a, int b);
}
public class Pro20 {
	public static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		JavaInterface2 obj=Pro20::add;
		System.out.println(obj.add(20, 30));

	}

}
