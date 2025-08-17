package Java8features;

interface p10{
	default void m1() {
		System.out.println("Default method 1");
	}
}
interface p20{
	default void m2() {
		System.out.println("Default method 2");
	}
}
//Accessing Default Methods
//When a class inherits default methods with the same name from multiple 
//interfaces, it must explicitly choose which one to call
//The syntax InterfaceName.super.methodName() is used to resolve the ambiguity.
class child1 implements p10, p20{
	public void m3(){
		p10.super.m1();
		p20.super.m2();
	}
}
public class DefaultMethod {

	public static void main(String[] args) {
		child1 obj=new child1();
		obj.m3();

	}

}
