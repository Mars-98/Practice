import java.util.Stack;

public class Palindromes {
	public static void main(String[]args) {
		String s = "";
//		System.out.println(s.length()/2);
//		String fHalf = s.substring(0,s.length()/2);
//		String sHalf = s.substring(s.length()/2);
		boolean result = palindrome2(s);
		System.out.print(result);
//		System.out.print(fHalf + " ");
//		System.out.print(sHalf);
	}
	
	//I have 3 solutions
	
	// have two pointers, one at end and one at beginning and check each character
	//doesn't matter if it's even or odd, because if first and second half are equal, then that's all that matters
	public static boolean palindrome(String s) { 
		int i = 0;
		int j = s.length()-1;
		for(int k = 0; k < s.length()/2; k++) {
			if(!(s.charAt(i)==s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	// reverse a string, then compare if it's the same or not
	public static boolean palindrome2(String s) { 
		String reversed = "";
		for(int i = 0; i<s.length(); i++) {
			reversed = s.charAt(i) + reversed;
		}
		if(s.equals(reversed)) {
			return true;
		}
		return false;
	}
	
	
	public static boolean palindrome6(String s) { 
		int len = s.length()/2;
		for(int i = 0; i<len; i++) {
			char last = s.charAt((s.length()-1) - i);
			if(s.charAt(i) != last) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
// I took a roundabout way of dividing the string in half and putting the first half in a stack, then going over 
// the second half and checking it against the stack characters
	public static boolean palindrome3(String s) { 
		Stack<Character> p = new Stack<Character>();
		if(s.length() == 1 || s.length() == 0) return true;
		
		for(int i = 0; i<s.length()/2; i++) {
			p.push(s.charAt(i));
		}
		
		if(s.length() % 2 == 0) {
			String sHalf = s.substring(s.length()/2);
			
			for(int j = 0; j < sHalf.length(); j++) {
				if(!(sHalf.charAt(j) == p.pop())) {
					return false;
				}
			}
			return true;
			
		}else {
			String sHalf = s.substring((s.length()/2)+1);
			for(int j = 0; j < sHalf.length(); j++) {
				if(!(sHalf.charAt(j) == p.pop())) {
					return false;
				}
			}
			return true;
		}
	}
}
