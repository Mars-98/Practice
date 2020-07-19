public class prodOfArrExceptSelf {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		int[] result = productExcSelf(arr);
		for(int n: result) {
			System.out.println(n);
		}
	}
	//multiply all the numbers together from the array, except the number you're on
	//iterative and least desirable
	public static int[] productExceptSelf(int[] nums) {
		 int[] arrResult = new int[nums.length];
	        int result = 1;
	        for(int i = 0; i < nums.length; i++){
	            for(int j = 0; j < nums.length; j++){
	                if(j == i){
	                    continue;
	                }
	                result = result * nums[j];
	            }
	            arrResult[i] = result;
	            result = 1;
	        }
	        return arrResult;
    }
	
	//Solution that doesn't use extra space, and it's O(N)
	public static int[] productExcSelf(int[] nums) {
		int[] left = new int[nums.length];
		left[0] = 1;
		for(int i = 1; i < nums.length; i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		int right = 1;
		int k = left.length-1;
		for(int j = nums.length - 1; j>0; j--) {
			right = right * nums[j];
			left[k-1] = left[k-1] * right;
			k--;
		}
		return left;
		
	}
}
