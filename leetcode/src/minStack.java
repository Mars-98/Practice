import java.util.Stack;

public class minStack {
	public static void main(String[]args) {
		minStack s = new minStack();
//		s.push(0);
//		s.push(1);
//		s.push(0);
//		s.getMin();
	//	s.pop();
	//	s.getMin();
		s.top();
		
	}
	Stack<Integer> minStack;
    Stack<Integer> stack;
    
    /** initialize your data structure here. */
    public minStack() {
        minStack = new Stack<Integer>();
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        if(stack.peek()==getMin()){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()){
            return Integer.MAX_VALUE;
        }
        return stack.peek();
    }
    
    public int getMin() {
        if(stack.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return minStack.peek();
    }
}
