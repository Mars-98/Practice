public class RemoveOutermostParentheses {
	public static void main(String[]args) {
		String s = "((()()(())))";
		
		String returned = removeOuterParentheses(s);
		System.out.print(returned);
	}
	
	public static String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
       int opened = 0;
       for (char c : S.toCharArray()) {
           if (c == '(' && opened++ > 0) s.append(c); //the opened++ means check if opened > 0, then increment
           if (c == ')' && opened-- > 1) s.append(c); //same for decrementing opened
       }
       return s.toString();
   }
}
