
public class fromlast {
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
		System.out.print("\n" + fromLast(result, 6).data);
	}
	
	//Find the node that is n elements away from the last node
	public static linkedList.node fromLast(linkedList result, int n) {
		if(result.head == null) {
			return null;
		}
		linkedList.node fast = result.head;
		linkedList.node slow = result.head;
		while(n>0) {
			fast = fast.next;
			n--;
		}
		
		while(fast.next!= null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
		
	}
}
