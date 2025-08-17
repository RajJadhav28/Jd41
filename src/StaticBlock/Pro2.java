package StaticBlock;

public class Pro2 {
	//static method can be called directly or with class
	int i=10;
	static int j=20;
	public void show() {
		System.out.println("Show method!!!");
	}
	static void display() {
//		show();//A static method can call only other static methods and cannot call non-static method.
		System.out.println("1");
//		System.out.println(this.i);//A static method cannot refer to "this" or "super" keyword in anyway.
		
	}
	void display1() {
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		display();
		Pro2 obj=new Pro2();
		obj.display1();
		System.out.println(j);
		

	}

}
