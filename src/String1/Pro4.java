package String1;

public class Pro4 {
//The compareTo() method compares strings character by character. 
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Mello";
		String s3="meklo";
		String s4="hemelo";
		String s5="flag";
		String s6="";
		//"Hello" and "Mello" differ in the first character: 
		//'H' (Unicode value 72) and 'M' (Unicode value 77). So, the result will be:
		System.out.println(s1.compareTo(s2));//72 - 77 = -5
		//s1 = "Hello" and s3 = "meklo"
		//"H" (Unicode value 72) and "m" (Unicode value 109) are compared.
		System.out.println(s1.compareTo(s3));//72 - 109 = -37
		//s1 = "Hello" and s4 = "hemelo"
		//The first character comparison is between 'H' (72) and 'h' (104).
		System.out.println(s1.compareTo(s4));//72 - 104 = -32
//		s1 = "Hello" and s5 = "flag"
//		The first character comparison is between 'H' (72) and 'f' (102)
		System.out.println(s1.compareTo(s5));//72 - 102 = -30
//		s1 = "Hello" and s6 = "" (empty string)
//		When comparing a string with an empty string,
//		compareTo() returns the length of the non-empty string, since an empty string has no characters to compare.
		System.out.println(s1.compareTo(s6));//"Hello".length() = 5
	}
}
