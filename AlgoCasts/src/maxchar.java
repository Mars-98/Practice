import java.util.HashMap;
import java.util.Map;

public class maxchar {
	public static void main(String[]args) {
		String s = "apple 112343333222";
		char max = maxChar(s);
		System.out.print(max);
		
	}
	public static char maxChar(String s) {
		int max = 0, tmp = 0;
		char maxChar = 0;
		Map<Character, Integer> str = new HashMap<Character, Integer>();
		for(char c: s.toCharArray()) {
			if(str.get(c) == null) {
				max = 1;
				str.put(c, max);
			}else {
				max = str.get(c);
				str.replace(c, ++max);
			}
		}
		for(Map.Entry<Character, Integer> entry: str.entrySet()) {
			max = entry.getValue();
			if(max > tmp) {
				tmp = max;
				maxChar = entry.getKey();
			}
		}
		return maxChar;
	}
}
