import java.util.Stack;

public class ValidateStackSequences {
	public static void main(String[]args) {
		int[] one = {1,2,3,4,5};
		int[] two = {4,5,3,1,2};
		
		System.out.print(validateStackSequences(one, two));
	}
	
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		 if(pushed.length == 0 || popped.length == 0) return true;
	        Stack<Integer> stack = new Stack<Integer>();
	        int i = 0;
	        for(int num : pushed){
	            stack.push(num);
	            while(!stack.empty() && stack.peek() == popped[i]){
		        	stack.pop();
		        	i++;
		        }
	        }
	        return stack.isEmpty();
	}
}
	
