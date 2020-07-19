public class LinkedList {
	 node head;
	    int size;
	    static class node{
	        int val;
	        node next;
	        
	        public node(int data){
	            this.val = data;
	        }
	    }
	    /** Initialize your data structure here. */
	    public LinkedList() {
	        this.head = null;
	        this.size = 0;
	    }
	    
	    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	    public int get(int index) {
	        if(index >= size) return -1;
	        
	        int counter = 0;
			node tmp = head;
			while(tmp!=null) {
				if(counter == index){
					return tmp.val;
				}
				counter++;
				tmp = tmp.next;
			}
			return -1;
	    }
	    
	    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	    public void addAtHead(int val) {
	       node one = new node(val);
			if(head != null) {
				one.next = head;
			} 
			head = one;
	        size++;
	    }
	    
	    /** Append a node of value val to the last element of the linked list. */
	    public void addAtTail(int val) {
	        if(head == null) {
	            head = new node(val);
	            return;
	        }
	        node tmp = head;
	        while(tmp.next!=null) {
	            tmp = tmp.next;
	        }
	        tmp.next = new node(val);
	        size++;
	    }
	    
	    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	    public void addAtIndex(int index, int val) {
	        if(head == null){
	        	size++;
				head = new node(val);
				return;
			}
			if(index == 0) {
				addAtHead(val);
				return;
			}
			if(index == size) {
				addAtTail(val);
				return;
			}
			if(index > size) return;

			node newnode = new node(val);
	        
	        int i = 0;
	        node dummy = head;
	       
	        while(dummy != null){
	            if(i+1 == index){
	                newnode.next = dummy.next;
	                dummy.next = newnode;
	                size++;
	                return;
	            }
	            i++;
	            dummy = dummy.next;
	        }
	        size++;
	        
	    }
	    
	    /** Delete the index-th node in the linked list, if the index is valid. */
	    public void deleteAtIndex(int index) {
	       if(index >= size) return;
			if(index == 0) {
				size--;
				head = head.next;
				return;
			}
	        int counter = 1;
	        node tmp = head;
	        while(tmp.next!=null) {
	            if(counter == index) {
	                tmp.next = tmp.next.next;
	                size--;
	                return;
	            }
	            counter++;
	            tmp = tmp.next;
	        }
	        size--;
	    }
	    public void print() {
			node tmp = head;
			while(tmp!=null) {
				System.out.print(tmp.val + " ");
				tmp = tmp.next;
			}
			System.out.println("\n");
		}
	    

		public static node mergeTwoLists(node l1, node l2) {
			 node merged = new node(-1);
		        node dummy = merged;
		        while(l1 != null && l2 != null){
		            if(l1.val <= l2.val){
		                dummy.next = new node(l1.val);
		                l1 = l1.next;
		            }else{
		                dummy.next = new node(l2.val);
		                l2 = l2.next;
		            }
		            dummy = dummy.next;
		        }
		        while(l1 != null){
		            dummy.next = new node(l1.val);
		            dummy = dummy.next;
		            l1 = l1.next;
		        }
		        while(l2 != null){
		            dummy.next = new node(l2.val);
		            dummy = dummy.next;
		            l2 = l2.next;
		        }
		        return merged.next;
		}
}
