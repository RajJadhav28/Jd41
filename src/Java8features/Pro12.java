package Java8features;

interface A14{
	public String show();
}
public class Pro12 {

	public static void main(String[] args) {
		A14 obj=()->{
			return "This is show method!!!";
		};
		System.out.println(obj.show());

	}

}
