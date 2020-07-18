
public class reverseString {
	public static void main(String[]args) {
		String a = "apple";
		String result = reverse2(a);
		System.out.print(result);
		
	}
	public static String reverse(String s) { // either start from end 
		String str = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i); // then do this
		}
		return str;
	}
	
	public static String reverse2(String s) {// or start from beginning
		String str = "";
		for(int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str; // and do this
		}
		return str;
	}
}
