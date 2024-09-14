package ConstructorReferences;

interface JavaInterface{
	void showInfo();
}
public class Pro1 {
	Pro1(){
		System.out.println("Constructors using method reference");
	}
	public static void main(String[] args) {
		JavaInterface obj=Pro1::new;
		obj.showInfo();
	}
}
