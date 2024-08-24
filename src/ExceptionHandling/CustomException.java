package ExceptionHandling;

class MyException extends Exception{
	private int ex;
	MyException(int a){
		ex=a;
	}
	@Override
	public String toString() {
		return "MyException [ex=" + ex + "] is less than zero";
	}
	
}
public class CustomException {
	static void sum(int a, int b) throws MyException{
		if(a<0) {
			throw new MyException(a);//calling constructor of user-defined exception class
		}else {
			System.out.println("c:"+(a+b));
		}
	}
	public static void main(String[] args) {
		try {
			sum(-10,10);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
