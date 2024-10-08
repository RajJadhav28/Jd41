package Multithreading;

class Mythread2 implements Runnable{
	public void run() {
		System.out.println("run method using runnable.");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread2  mt1=new Mythread2();
		Thread th=new Thread(mt1);
		th.start();

	}

}
