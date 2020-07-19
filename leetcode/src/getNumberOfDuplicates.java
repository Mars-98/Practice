import java.util.HashMap;

public class getNumberOfDuplicates {
	
	public static void main(String[]args) {
		int [] indicies = {1,2,3,3,4,4,5,6};
		
		int returned = getNumberOfDuplicate(indicies);
		System.out.print(returned);
	}
	
	public static int getNumberOfDuplicate(int[] nums) {
	    HashMap<Integer, Integer> numbers = new HashMap<>();
	    int countOfDuplicates = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (numbers.get(nums[i]) != null) {
	        	countOfDuplicates++;
	        	
	        } else {
	        	numbers.put(nums[i], nums[i]);
	        }
	    }
	    
	    return countOfDuplicates;
	}
}

