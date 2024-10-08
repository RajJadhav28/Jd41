package Multithreading;

class Mythread extends Thread{
	public void run() {
		System.out.println("I am first thread");
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mt=new Mythread();
		mt.start();

	}

}
