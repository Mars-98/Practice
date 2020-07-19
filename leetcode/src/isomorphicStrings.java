import java.util.HashMap;

public class isomorphicStrings {
	public static void main(String[]args) {
		System.out.println(isomorphic("fio", "foo"));
	}
	//isomorphism is basically if you were to replace characters from two strings, it'd still make a word
	//like dad and mom, same characters must be mapped to same character when declared. Like M must map to D always
	public static boolean isomorphic(String a, String b) {
		if(a.length() != b.length()) return false;
		HashMap<Character, Character> mapA = new HashMap<Character, Character>();
		HashMap<Character, Character> mapB = new HashMap<Character, Character>();
		for(int i = 0; i < a.length(); i++) {
			char A = a.charAt(i);
			char B = b.charAt(i);  
			if(mapA.containsKey(A)) {
				if(mapA.get(A) != B) {
					return false;
				}
			}else if(mapB.containsKey(B)) {
				if(mapB.get(B) != A) {
					return false;
				}
			}else {
				mapA.put(A, B);
				mapB.put(B,A);
			}
		}
		return true;
	}
}
