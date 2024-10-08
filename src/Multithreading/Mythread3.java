package Multithreading;

public class Mythread3 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			try {
				sleep(1000);
				System.out.println("wakeup");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread3 mt=new Mythread3();
		mt.start();
		mt.setName("Thread1:");
		
		Mythread3 mt2=new Mythread3();
		mt2.start();
		mt2.setName("Thread2:");

	}

}
