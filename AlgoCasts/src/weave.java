import java.util.LinkedList;
import java.util.Queue;

public class weave {
	public static void main(String[]args) {
		Queue<Integer> one = new LinkedList<Integer>();
		one.add(1);
		one.add(5);
		
		Queue<Integer> two = new LinkedList<Integer>();	
		
		two.add(2);
		two.add(4);
		two.add(6);
		two.add(9);
		
//		Queue<Integer> combined = Weave(one, two);
//		int size = combined.size();

//		for(int i = 0; i<size; i++) {
//			System.out.print(combined.remove());
//		}
		
		//Trying to test my stack class but it aint working 
		stack on = new stack(3);
		on.push(2);
		on.push(4);
		on.push(5);
		
		
		on.pop();
//		int sze = on.size;
//		for(int i = 0; i < sze; i++) {
//			System.out.print(on.pop());
//			
//		}
		
		queue tw = new queue(4);
		tw.enqueue(5);
		tw.enqueue(4);
		tw.enqueue(7);
		
//		int szee = tw.size;
//		for(int i = 0; i < szee; i++) {
//			System.out.print(tw.dequeue());
//		}
		
		// Now I'm trying to test queuefromstack, it works!
		
		queuefromstack q = new queuefromstack();
		q.add(1);
		q.add(4);
		q.add(6);
		q.add(9);
		
//		while(q.size!=0) {
//			System.out.print(q.remove());
//		}
		q.remove();
		q.remove();
		while(q.size>0) {
			System.out.print(q.remove());
		}
	}
	//adding two queues together in a weaving pattern 
	public static Queue<Integer> Weave(Queue<Integer> one, Queue<Integer> two) {
		Queue<Integer> combined = new LinkedList<Integer>();

		while(!one.isEmpty() || !two.isEmpty()) {
			if(!one.isEmpty()) {
				combined.add(one.remove());
			}
			if(!two.isEmpty()) {
				combined.add(two.remove());
			}
		}
		return combined;
		
	}
}
