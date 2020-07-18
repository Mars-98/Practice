import java.util.LinkedList;


public class levelwidth {
	public static void main(String[]args) {
		tree t = new tree();
		tree.node r = new tree.node(3);
		t.root = r;
		t.root.add(1);
		t.root.add(3);
		t.root.add(4);
		for(int i = 0; i < t.root.children.size(); i++) {
			System.out.print(t.root.children.get(i).data);
		}
		System.out.print("\n");
		LinkedList<Integer> result = lvlWidth(t.root);
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}
		
	}
	//used breadth first search to find the width of a tree
	public static LinkedList<Integer> lvlWidth(tree.node root) {
		int counter = 0;
		LinkedList<Integer> width = new LinkedList<Integer>();
		LinkedList<tree.node> visited = new LinkedList<tree.node>();
		visited.add(root);
		visited.add(null); // this is an indicator that we've finished with the level
		while(visited.size() >= 1) {
			tree.node removed = visited.poll();
			if(removed == null) {
				width.add(counter);	
				visited.addLast(null);
				counter = 0;
				if(visited.size() == 1) {
					break;
				}
			}else {
				counter++;
				//adds children to end of visited array
				for(tree.node n: removed.children) {
					visited.add(n);
				}
			}
		}
		return width;
	}
}
