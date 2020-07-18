public class circular {
	public static void main(String[]args) {
		linkedList result = new linkedList();

		result.insert(1);
		result.insert(7);
		result.insert(3);
		result.insert(4);
		result.insert(2);
		result.insert(8);
		result.insert(20);

		result.print();
		System.out.print("\n" + Circular(result));
	}
	//return true if list is circular and false if it's not
	public static boolean Circular(linkedList result) {
		if(result.head == null) {
			return false;
		}
		linkedList.node  fast = result.head;
		linkedList.node slow = result.head;
		
		while(fast.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
