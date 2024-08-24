package ExceptionHandling;

public class Pro2 {

	public static void main(String[] args) {
		int a[]= {5,7,0,1,2,4};
		try {
			a[6]=a[0]/a[2];
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
