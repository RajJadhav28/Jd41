package ExceptionHandling;

class demo{
	void fun() throws InterruptedException {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
		}
	}
}
public class ThrowsEx {

	public static void main(String[] args) throws InterruptedException {
		demo d=new demo();
		d.fun();
//		try {
//			d.fun();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		

	}

}
