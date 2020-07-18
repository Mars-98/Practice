import java.util.HashSet;
/*At first look, time complexity looks more than O(n). If we take a closer look, 
 * we can notice that it is O(n) under the assumption that hash insert and search take O(1) time. 
 * The function S.find() inside the while loop is called at most twice for every element. 
 * For example, consider the case when all array elements are consecutive. In this case, 
 * the outer find is called for every element, but we go inside the if condition only for the smallest element. 
 * Once we are inside the if condition, we call find() one more time for every other element.
 */

public class LongestConseqSubseq {
	public static void main(String[]args) {
		int arr[] =  {1, 9, 3, 10, 4, 20, 2, 5, 9, 6, 7, 10, 8}; 
		System.out.println("Length of the Longest consecutive subsequence is " + 
				findLongestConseqSubseq(arr)); 
	} 

	public static int findLongestConseqSubseq(int arr[]){
		HashSet<Integer> set = new HashSet<Integer>();
		int max = 0;
		for(int i = 0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		for(int i =0; i<arr.length; i++) {
			//we want to start always at the beginning of a number sequence, therefore
			//we check if it has smaller, if it does, keep looking for it
			if(!set.contains(arr[i]-1)) {
				int j = arr[i];
				while(set.contains(j)) {
					//we increment j because we're checking to see if the next number exists in the list, 
					//if it does, we keep incrementing until it doesn't
					j++;
				}
				//and so when we're out here, we check to see if the max number is less than 
				//the incremented j number we reached compared to the element of the current index
				if(max < j-arr[i]) {
					max = j-arr[i];
				}
			}
		}
		return max;
	}
}
