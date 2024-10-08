package Multithreading;

public class ChildThread extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("Thread name:"+t.getName());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread ct=new ChildThread();
		ct.start();
		ct.setName("Raj");

	}

}
