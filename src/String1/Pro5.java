package String1;

public class Pro5 {
//	In s1 = "Sachin" + " Tendulkar";, both operands are strings, so they are simply concatenated.
//	In s2 = 50 + 50 + "Sachin" + 40 + 40;, Java first performs addition on the numbers (50 + 50 = 100), 
//	then starts concatenating once it encounters the first string ("Sachin").
//	After that, everything is treated as a string, and the numbers (40 and 40) are concatenated as strings.
//	Output:
//		Sachin Tendulkar
//		100Sachin4040

	public static void main(String[] args) {
		String s1="Sachin"+" Tendulkar";
		String s2=50+50+"Sachin"+40+40;
		System.out.println(s1);
		System.out.println(s2);
	}
}
