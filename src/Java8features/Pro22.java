package Java8features;


interface javainterface11{
	void add(int a, int b);
}
public class Pro22 {
	int a;
	int b;
	Pro22(int a, int b){
		this.a=a;
		this.b=b;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		javainterface11 obj=Pro22::new;
		obj.add(20, 20);

	}

}
