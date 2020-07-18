
public class pyramids {
	public static void main(String[]args) {
//		int i = 0;
//		String result = "";
//		Pyramids2(5, i, result);
		Pyramids(5);
	}
	
	//Iterative solution
	public static void Pyramids(int n) {
		int column = (n * 2) - 1;
		int midpoint = (int) Math.floor(column/2);
		for(int i = 0; i < n; i++) {
			String level = "";
			for(int j = 0; j < column; j++) {
				if( j >=midpoint - i && j <=midpoint + i) {
					level += "#";
				}else {
					level += " ";
				}
			}
			System.out.println(level);
		}
	}
	
	//recursion, not too easy
	public static int Pyramids2(int n, int i, String level) {
		if(n == i) {
			return 0;
		}
		int column = (n * 2) - 1;
		int midpoint = (int) Math.floor(column/2);
		
		if(level.length()==column) {
			System.out.println(level);
			level = "";
			i++;
			return Pyramids2(n, i, level);
		}
		if( midpoint - i <= level.length() && midpoint + i >= level.length()) {
			level += "#";
		}else {
			level += " ";
		}
		return Pyramids2(n, i, level);
	}
	
}
