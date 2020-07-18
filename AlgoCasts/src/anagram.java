import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class anagram {
	public static void main(String[]args) {
		String a = " hello%$#@";
		String b = "HeLoL0 &^^&";
//		Anagram(a,b);
		boolean result = Anagram4(a,b);
		System.out.print(result);
	}
	
	//helper function to add values into given hashmap for Anagram2 and Anagram3
	public static HashMap<Character, Integer> fillMap(String t, HashMap<Character, Integer> map) {
		String cond = t.replaceAll("[^\\w]", "").toLowerCase();
		for(char c: cond.toCharArray()) {
			if(map.get(c) != null) {
				int val = map.get(c);
				map.replace(c, ++val);
			}else {
				map.put(c, 1);
			}
		}
		return map;
	}
	
	//using hashmap, I put both strings into their own respective hashmap, then checked both of their values
	public static boolean Anagram2(String a, String b) {
		
		HashMap<Character, Integer> A = new HashMap<Character, Integer>();;
		A = fillMap(a, A);
		HashMap<Character, Integer> B = new HashMap<Character, Integer>();
		B = fillMap(b, B);
		if(A.size() != B.size()) {
			return false;
		}
		
		for(Map.Entry<Character, Integer> entry: A.entrySet()) {
			if(B.containsKey(entry.getKey())) {
				if (entry.getValue() == B.get(entry.getKey())) {
					return true;
				}
				
			}else {
				return false;
			}
		}	
		return false;
	}
	
	
	//Checks if there is an even amount of values in the hashmap that contains both strings
	public static boolean Anagram3(String a, String b) {
		HashMap<Character, Integer> AuB = new HashMap<Character, Integer>();
		AuB = fillMap(a, AuB);
		AuB = fillMap(b, AuB);
		
		for(Map.Entry<Character, Integer> entry: AuB.entrySet()) {
				if (entry.getValue() % 2 != 0) {
					return false;
				}
		}		
			
		return true;
		
	}
	
	//helper method for Anagram4
	public static char[] cleanStr(String t) {
		char[] cond = t.replaceAll("[^\\w]", "").toLowerCase().toCharArray();
		Arrays.sort(cond);
		return cond;
	}
	//in an array, then sort and check
	public static boolean Anagram4(String a, String b) {
		if(Arrays.equals(cleanStr(a), cleanStr(b))) {
			return true;
		}
		return false;
	}
	
}
