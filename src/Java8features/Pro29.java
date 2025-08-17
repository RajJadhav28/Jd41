package Java8features;

interface I{
	void m1();
	void m2();
	default void m3() {
		System.out.println("I am a default method.");
	}
}
class Test1 implements I{

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	public void m3() {
		System.out.println("I am overriden default method!!!");
	}
	
}
class Test2 implements I{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Pro29 {
	public static void main(String[] args) {
		Test1 obj=new Test1();
		obj.m3();

	}

}
