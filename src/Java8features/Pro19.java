package Java8features;

interface JavaInterface1{
	void showInterfaceInfo(int a, int b);
}
public class Pro19 {
	static void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		JavaInterface1 obj=Pro19::add;
		obj.showInterfaceInfo(10,20);

	}

}
