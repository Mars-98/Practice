import java.util.List;

public class P1 {
	public static void main(String[]args) {
		//need to convert int to integer when initializing a list of Integers
		//List<Integer> nums = {};
		//System.out.println(addUp(nums, 17));
		
		
	}
	public static boolean addUp(List<Integer> numbers, int k) {
		for(int i = 0; i<numbers.size(); i++) {
			for(int j = i+1; j<numbers.size(); j++) {
				if(numbers.get(i) + numbers.get(j) == k) {
					return true;
				}
			}
		}
		return false;
	}
}
