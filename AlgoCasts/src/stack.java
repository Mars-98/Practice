
public class stack {
	int[] arr;
	int rear;
	int size;
	int capacity;
	
	//can implement isFull, isEmpty, etc if i wanted
	stack(int cap){
		this.capacity = cap;
		size = 0;
		rear = 0;
		arr = new int[capacity];
	}
	public void push(int n) {
		arr[rear] = n;
		rear++;
		size++;
	}
	public  int pop() { 
		int tmp = arr[rear- 1];
		rear--;
		size--;
		return tmp;
	}
	public int peek() {
		return arr[rear];
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == capacity;
	}
	public void print() {
		for(int i = 0; i <size; i++) {
			System.out.print(pop());
		}
	}
}

