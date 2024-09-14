package Java8features;

interface JavaInterface21{
	void showInfo();
}
public class Pro21 {
	Pro21(){
		System.out.println("Constructor using method references.");
	}
	public static void main(String[] args) {
		JavaInterface21 obj=Pro21::new;
		obj.showInfo();
		
	}

}
