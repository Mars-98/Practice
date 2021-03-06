


public class linkedList {
	node head;
	int size;
	//class is made static so that main can access it
	//it's wrong to have it here. Should be a nested static class
	static class node{
		int data;
		node next;
		node(int d){
			data = d;
			//next is automatically assigned null
		} 
	}
	linkedList(){
		head = null;
		size = 0;
	}
	//add node in beginning of linked list
	public void insert(int info) {
		node one = new node(info);
		if(head != null) {
			one.next = head;
		} 
		head = one;

		//OR
		//insertAt(info, 0);
	}
	//get size of linked list
	public int size() {
		int size = 0;
		node tmp = head;
		while(tmp != null) {
			size++;
			tmp = tmp.next;
		}
		return size;
	}
	//print all elements
	public void print() {
		node tmp = head;
		while(tmp!=null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println("\n");
	}
	//return first element without removing it
	public node getFirst() {
		return head;
		//OR
		//getAt(0);
	}
	//return last element without removing it
	public node getLast() {
		if(head == null) {
			return null;
		}
		node tmp = head;
		while(tmp.next !=null) {
			tmp = tmp.next;
		}
		return tmp;

		//OR
		//getAt(size()-1);
	}

	public void clear() {
		head = null;
	}

	public void removeFirst() {
		if(head==null) {
			return;
		}
		head = head.next;

		//OR
		//removeAt(0);
	}

	public void removeLast() {
		if(head == null) {
			return;
		}
		else if(head.next == null) {
			head = null;
			return;
		}else {

			//			node tmp = head;
			//			while(tmp.next.next !=null) {
			//				tmp = tmp.next;
			//			}
			//			tmp.next = null;

			//OR we can do this
			node prev = head;
			node nde = head.next;
			while(nde.next!=null) {
				prev = prev.next;
				nde = nde.next;
			}
			prev.next = null;
		}

		//OR
		//removeAt(size()-1);
	}

	public void insertLast(int info) {
		//		if(head == null) {
		//			head = new node(info);
		//			return;
		//		}
		//		
		//		node tmp = head;
		//		while(tmp.next!=null) {
		//			tmp = tmp.next;
		//		}
		//		tmp.next = new node(info);

		//OR we can use getLast()
		node last = getLast();
		if(last!=null) {
			last.next = new node(info);
		}else {
			head = new node(info);
		}

		//OR
		//insertAt(info, size()-1);
	}

	public node getAt(int index) {
		int counter = 0;
		node tmp = head;
		if(index >= size()) return null;

		while(tmp!=null) {
			if(counter == index){
				return tmp;
			}
			counter++;
			tmp = tmp.next;
		}
		return null;
	}

	public void removeAt(int index) {
		if(index >= size()) return;
		if(index == 0) {
			head = head.next;
			return;
		}
		//		int counter = 1;
		//		node tmp = head;
		//		while(tmp.next!=null) {
		//			if(counter == index) {
		//				tmp.next = tmp.next.next;
		//				return;
		//			}
		//			counter++;
		//			tmp = tmp.next;
		//		}

		//OR I can do this
		node prev = getAt(index-1);
		prev.next = prev.next.next;
	}

	public void insertAt(int data, int index) {
		if(head == null){
			head = new node(data);
			return;
		}
		if(index == 0) {
			insert(data);
			return;
		}
		if(index > size()) return;
		if(index == size) insertLast(data);

		node newNode = new node(data);

		node prev = getAt(index-1);
		newNode.next = prev.next;
		prev.next = newNode;
	}


	public boolean isPalindrome(node head) {
		if(head == null) return true;

		node fast = head;
		node slow = head;

		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}

		fast = reverseList(slow);
		slow = head;
		while(slow != null && fast != null){
			if(slow.data != fast.data){return false;} 
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}



	public node reverseList(node head) {
		node prev = null;
		node tmp = null;
		while(head!=null){
			tmp = head.next;
			head.next = prev;
			prev = head;
			head = tmp;
		}
		return prev;
	}
	public boolean hasCycle(node head) {

		if(head == null) return false;
		node fast = head;
		node slow = head;
		while(fast.next != null && fast.next.next != null ){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) return true;
		}
		return false;
	}

	public void removeElements(node head, int val) {
		//		 while(head != null && head.data == val) {head = head.next;}
		////        node dummy = new node(-1);
		////        dummy.next = head;
		////        head = dummy;
		//		 node dummy = head;
		//         while(dummy != null && dummy.next!=null){
		//            if(dummy.next.data == val){
		//                dummy.next = dummy.next.next;
		//            }else{
		//                dummy = dummy.next;
		//            }
		//        }
		//        return head;
		//OR

		node holder = new node(-1);
		node dummy = holder;
		holder.next = head;
		while(head != null){
			if(head.data == val){
				dummy.next = head.next;
				head = dummy.next;
			}else{
				dummy = head;
				head = head.next;
			}
		}
		head = holder.next;
		//return holder.next;
	}

	public node deleteDuplicates(node head) {
		if (head == null || head.next == null) return head;

		node one = new node(-1);
		node ret = one;
		one.next = head;
		node two = head;
		node three = head;
		while(three != null) {
			int count = 0;
			while(three != null && two.data == three.data){
				count++;
				three = three.next;
			}
			if(count > 1){
				one.next = three;

			}else{
				one = one.next;
			}   
			two = three;
		}
		return ret.next;

	}
	public node swapNodesInPairs(node head) {
		node holder = new node(-1);
        holder.next = head;
        node curr = holder;

        while(curr.next != null && curr.next.next != null){
            node fNode = curr.next;
            node sNode = curr.next.next;
            fNode.next = sNode.next;
            curr.next = sNode;
            sNode.next = fNode;
            curr = fNode;
        }
        return holder.next;
	}

	node addOne(node head) {
		addWithCarry(head);
		return head;
	}
	//I WAS SUPPOSED TO DEBUG THIS, I HAVE NO IDEA WHAT I'M READING
	public int addWithCarry(node head) {
		// If linked list is empty, then return 1
		if (head == null)
			return 1;

		int carry = addWithCarry(head.next);
		int sum = head.data + carry;

		// Update data and return new carry
		head.data = (sum) % 10;
		return (sum) / 10;
	}
	
	public static node addTwoNumbers(node l1, node l2) {
	       String num = "";
	       node dummy = l2;
	       int sum = 0;
	         
	         while(l1 != null){
	             num = l1.data + num;
	             l1 = l1.next;
	         }
	         sum += Integer.valueOf(num);
	         num = "";
	         while(dummy!=null){
	              num = dummy.data + num;
	             dummy = dummy.next;
	         }
	         sum += Integer.valueOf(num);
	         node head = new node(-1);
	         dummy = head;
	         while(dummy !=null && sum != 0){
	             dummy.next = new node(sum % 10);
	             sum = sum / 10;
	             dummy = dummy.next;
	         }
//	         dummy = head.next;
//	         while(dummy!=null) {
//	        	 System.out.print(dummy.data);
//	        	 dummy = dummy.next;
//	         }
	         
	         return head.next;
	    }
	public static node getIntersectionNode(node headA, node headB) {
        if(headA == null || headB == null) return null;
        node intersect = null;
        int A = getSize(headA);
        int B = getSize(headB);
        int dif = Math.abs(A-B);
        node dummy = null;
        if(A > B){
        	node trackB = headB;
            dummy = fastForward(headA, dif);
            intersect = checkNode(trackB, dummy);
        }else{
        	node trackA = headA;
            dummy = fastForward(headB, dif);
            intersect = checkNode(trackA, dummy);
        }
        return intersect;
        
    }
    public static int getSize(node head){
    	node dummy = head;
        int counter = 0;
        while(dummy != null){
            counter++;
            dummy = dummy.next;
        }
        return counter;
    }
    public static node fastForward(node head, int dif){
    	node dummy = head;
        while(dif-1 > 0){
            dummy = dummy.next;
            dif--;
        }
        return dummy;
    }
    public static node checkNode(node A, node B){
        while(A != null && B != null){
            if(A==B){
                return A;
            }
            A = A.next;
            B = B.next;
        }
        return null;
    }

}













