
//not really sure this is right. But it's supposed to be an implementation of a queue.
public class queue {
	int[] arr;
	int rear;
	int front;
	int size;
	int capacity;
	
	//can implement isFull, isEmpty, etc if i wanted
	queue(int cap){
		this.capacity = cap;
		front = 0;
		size = 0;
		rear = 0;
		arr = new int[capacity];
	}
	public void enqueue(int n) {
		arr[rear] = n;
		rear++;
		size++;
	}
	public  int dequeue() {
		int tmp = arr[front];
		front++;
		size--;
		return tmp;
	}
	public int peek() {
		return arr[front];
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == capacity;
	}
	public void print() {
		for(int i = front; i <rear; i++) {
			System.out.print(arr[i]);
		}
	}
}
