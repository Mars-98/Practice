package aLeetcode;

import aLeetcode.LinkedList.node;

public class testLL {
	public static void main(String[]args) {
		LinkedList one = new LinkedList();
		one.addAtHead(4);
		one.addAtHead(2);
		one.addAtHead(1);
		
		LinkedList two = new LinkedList();
		two.addAtHead(5);
		two.addAtHead(3);
		two.addAtHead(1);
		
		node newone = LinkedList.mergeTwoLists(one.head, two.head);
		while(newone != null) {
			System.out.print(newone.val);
			newone = newone.next;
		}
	}
}
