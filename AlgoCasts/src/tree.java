import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class tree {
	node root;
	
	static class node{
		int data;
		List<node> children;
		
		node(int d){
			data = d;
			children = new ArrayList<node>();
		}
		void add(int d){
			children.add(new node(d));
		}
		void remove(int d) {
			for(node n: children) {
				if(n.data == d) {
					children.remove(children.indexOf(n));
				}
			}
		}
		
	}
	
	tree(){
		root = null;
	}
	//doesn't do anything, just traverses through
	node depthFirstSearch(node t) {
		LinkedList<node> visited = new LinkedList<node>();
		visited.add(root);
		while(!visited.isEmpty()) {
			node removed = visited.poll();
			if(removed == t) {
				return t;
			}
			for(int i = removed.children.size() - 1; i >= 0; i++) {
				visited.addFirst(removed.children.get(i));
			}
		}
		return null;
	}
	//doesn't do anything, just traverses through
	node BreadthFirstSearch(node t) {
		Queue<node> visited = new LinkedList<node>();
		while(!visited.isEmpty()) {
			node removed = visited.poll();
			visited.add(root);
			if(removed == t) {
				return t;
			}
			for(node n: removed.children) {
				visited.add(n);
			}
		}
		return null;
	}
	
}
