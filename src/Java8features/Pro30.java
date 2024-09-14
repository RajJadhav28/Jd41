package Java8features;

interface p1{
	default void m1() {
		System.out.println(" I am default p1.");
	}
}
interface p2{
	default void m2() {
		System.out.println("I am default p2.");
	}
}
class child implements p1,p2{
	
}
public class Pro30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
