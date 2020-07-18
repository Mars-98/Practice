package aLeetcode;

public class maximumSubArray {
	public static void main(String[] args) {
		int[] arr = {1,-2,3,4};
		
		int result = maxSubArray(arr);
		
			System.out.println(result);
		}

	//Find the subarray that makes up the maximum value 
	/*
	 *  Input: [-2,1,-3,4,-1,2,1,-5,4],
	 *	Output: 6
	 *	Explanation: [4,-1,2,1] has the largest sum = 6.
	 */
	 public static int maxSubArray(int[] nums) {
	       if(nums.length == 0) return 0;
	       // int[] arr = new int[nums.length];
	       // arr[0] = nums[0];
	        int max = nums[0];
	        int current = nums[0];
	        for(int i = 1; i < nums.length; i++){
	            current = Math.max(current + nums[i],nums[i]);
	            max = Math.max(max, current);
	        }
	        return max;
	    }
}
