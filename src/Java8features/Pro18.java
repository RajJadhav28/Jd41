package Java8features;

interface JavaInterface{
	void showInterfaceInfo();
}
public class Pro18 {
	static void show() {
		System.out.println("This is called method references.");
	}
	public static void main(String[] args) {
		JavaInterface ji=Pro18::show;
		ji.showInterfaceInfo();
		

	}

}
