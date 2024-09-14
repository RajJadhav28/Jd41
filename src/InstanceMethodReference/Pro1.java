package InstanceMethodReference;


interface JavaInterface{
	void showInterfaceInfo();
}
public class Pro1 {
	void show() {
		System.out.println("This is called using instance method reference.");
	}
	public static void main(String[] args) {
		Pro1 demo=new Pro1();
		//refering method
		JavaInterface ji=demo::show;
		ji.showInterfaceInfo();
	}

}
