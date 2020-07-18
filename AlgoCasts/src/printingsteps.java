
public class printingsteps {
	public static void main(String[]args) {
//		String result = "";
		steps2(3);
	}
	//my own inefficient solutions - brute force
	public static void steps(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			for(int k = i+1; k<=n; k++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	//another bad solution - brute force
	public static void steps2(int n) {
		for(int i = 0; i < n; i++) {
			String result = "";
			for(int j = 0; j < n; j++) {
				if(j <= i) {
					result += "#";
				}else {
					result += " ";
				}
			}
			System.out.println(result);
		}
		
	}
	//recursion
	//when I had it at void, the return statement doesn't work, probably because
	//it's confused between the callers and returns to call inside of the method
	//However, when I return something, it exits properly
	
	//This was a much harder method than the others, I don't understand recursion as much
	public static int steps3(int n, int i, String result) {
		//must always have a base case
		if(i==n) {
			return 0;
		}
		if(result.length()==n) {
			System.out.println(result);
			result = "";
			i++;
			return steps3(n, i, result);
		}
		if(result.length()<=i) {
			result += "#";
		}else {
			result += " ";
		}
		return steps3(n, i, result);
	}
}
