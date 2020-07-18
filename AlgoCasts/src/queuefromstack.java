
public class queuefromstack {
	stack one;
	stack two;
	int size;
	queuefromstack(){
		one = new stack(5);
		two = new stack(6);
		size = 0;
	}
	
	public void add(int n) {
		one.push(n);	
		size++;
	}
	
	public int remove() {
		int tmp = 0;
		while(!one.isEmpty()) {
			two.push(one.pop());
		}
		if(!two.isEmpty()) {
			tmp = two.pop();
		}
		
		while(!two.isEmpty()) {
			one.push(two.pop());
		}
		size--;
		return tmp;
	}
	
	public int peek() {
		while(!one.isEmpty()) {
			two.push(one.pop());
		}
		int tmp = two.peek();
		
		while(!two.isEmpty()) {
			one.push(two.pop());
		}
		return tmp;
		
	}
}
