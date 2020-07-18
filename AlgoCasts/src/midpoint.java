public class midpoint {
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
		System.out.print("\n" + midPoint(result).data);

	}
	//find midpoint of a linked list without using size or a counter
	public static linkedList.node midPoint(linkedList result) {
		if(result.head == null) {
			return null;
		}
		linkedList.node fast = result.head;
		linkedList.node slow = result.head;

		while(fast.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}
}
