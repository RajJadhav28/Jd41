package ConstructorReferences;

interface add{
	public void show(int a, int b);
}
public class Pro2 {
	Pro2(int a, int b){
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	public static void main(String[] args) {
		add obj=Pro2::new;
		obj.show(10, 20);

	}

}
