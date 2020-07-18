package aLeetcode;

import java.util.Stack;

public class reversePolishNotation {
	public static void main(String[]args) {
		String[] exp = {"2","1","+","3","*"};
		
		System.out.print(evalRPN(exp));
	}
	public static int evalRPN(String[] tokens) {
		String exp = "+-*/";
        Stack<Integer> result = new Stack<Integer>();
        for(String token: tokens){
            if(!exp.contains(token)){
                result.push(Integer.parseInt(token));
            }else{
                 int two = result.pop();
                 int one = result.pop();
                 if(token.equals("+")) result.push(one+two);
                 else if(token.equals("-")) result.push(one-two);
                 else if(token.equals("*")) result.push(one*two);
                 else if(token.equals("/")) result.push(one/two);
            }
         }
        return result.pop();
	}
       
}
