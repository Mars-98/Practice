
public class BSTree {
	node root;
	
	static class node{
		node left, right;
		int data;
		node(int d){
			data = d;
			this.left = null;
			this.right = null;
		}
		
		void insert(int d) {
			if(d<this.data) {
				if(this.left == null) {
					this.left = new node(d);
				}else {
					this.left.insert(d);
				}
			}else {
				if(this.right == null) {
					this.right = new node(d);
				}else {
					this.right.insert(d);
				}
			}
		}
		node contains(int d) {
			if(d==this.data) {
				return this;
			}else if(d < this.data && this.left!=null){
				this.left.contains(d);
			}else if(d > this.data && this.right!=null){
				this.right.contains(d);
			}
			return null;
		}
	}
	void printTree(node node)
	 {
	    if(node == null) return;

	    System.out.println(node.data);
	    printTree(node.left);
	   printTree(node.right);
	 }
}
