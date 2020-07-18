
public class validateBST {
	public static void main(String[]args) {
		BSTree tree = new BSTree();
		tree.root = new BSTree.node(3);
		tree.root.insert(2);
		tree.root.insert(5);
		tree.root.insert(2);
		tree.printTree(tree.root);

	}
	//we set a default value to min and max of -1, so when we check if they moved at all,
	// we'd know which direction the tree has been going in 
	
	//Perhaps I need a little more reviewing, as I'm not going to be able to think of the solution again without this code
	//Everytime we move left, we update max to r.data, and every time we move right we update min to r.data.
	// 							10
	//						/		\
	//					0				12
	//				/		\		/		\
	//		 	  -1	  	4	  	11  	20
	//				\
	//				  15
	//If i had a min and max here and I'm trying to validate node 15, My min would be -1, and my max would be 0
	//It's hard to understand I know. If you get stuck, check out the udemy course you bought, should had the explanation.
	
	//This method is trying to figure out if a tree was a valid binary search tree
	boolean validate(BSTree.node r, int min, int max) {
		if(max != -1 && r.data > max) {
			return false;
		}
		if(min != -1 && r.data < min) {
			return false;
		}
		if(r.left != null && !validate(r.left, min, r.data)) {
			return false;
		}
		if(r.right != null && !validate(r.right, r.data, max)) {
			return false;
		}
		
		return true;
	}
}
