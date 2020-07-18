import java.util.ArrayList;

public class vowels {
	public static void main(String[]args) {
		String s = "Hello Theyyyre fellas OI uuuu!";
		System.out.print(Vowels4(s));
	}
	
	//BEST ONE
		//using regex, remove all non-indices, then return length 
		public static int Vowels4(String s) {
			String v = s.replaceAll("[^aeiouAEIOU]", "");
			
			return v.length();
		}
	
	//iterative solution
	public static int Vowels(String s) {
		int count = 0;
		for(char c: s.toCharArray()) {
			c = Character.toLowerCase(c);
			if(c == 'i' || c == 'e' || c == 'o' || c == 'a' || c == 'u') {
				count++;
			}
		}
		return count;
	}
	
	//Another iterative solution
	public static int Vowels2(String s) {
		s = s.toLowerCase();
		String pattern = "aeoiu";
		int count = 0;
		for(char c: s.toCharArray()) {
			if(pattern.indexOf(c) != -1) {
				count++;
			}
		}
		return count;
	}
	
	//easier for developers to understand 
	// but also, if we're looking for specific sequences like "abc", etc, it's easier to do it this way
	public static int Vowels3(String s) {
		s = s.toLowerCase();
		ArrayList<Character> pattern = new ArrayList<Character>();
		pattern.add('a');
		pattern.add('e');
		pattern.add('i');
		pattern.add('o');
		pattern.add('u');
		int count = 0;
		for(char c: s.toCharArray()) {
			if(pattern.indexOf(c) != -1) {
				count++;
			}
		}
		return count;
	}
}
