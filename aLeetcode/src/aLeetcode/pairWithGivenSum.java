package aLeetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//given a sum and array, find two numbers from that array that add up to the sum
public class pairWithGivenSum {
	public static void main(String[]args) {
		int[] arr = {2,2,4, 5, 6};
		System.out.println(twoSum(arr, 6)[0] + " " + twoSum(arr, 6)[1]);
	}
	//arr will always be sorted, iterative solution, two pointers that check the left and right side
	//This will return modified indices, and not the origibal ones, because it has been sorted
	public static int[] pair(int sum, int[] arr) {
		Arrays.sort(arr);
		int[] pair = new int[2];
		int right = arr.length-1, left = 0;
		while(left < right) {
			if(arr[left] + arr[right] == sum) {
				pair[0] = left;
				pair[1] = right;
				return pair;
			}else if(arr[left] + arr[right] > sum) {
				right--;
			}else if(arr[left] + arr[right] < sum) {
				left++;
			}
		}
		return null;
	}

	//Hashset solution, returns true or false
	public static boolean pairs(int sum, int[] arr) {
		HashSet<Integer> vals = new HashSet<Integer>();
		for(int n: arr) {
			if(vals.contains(sum - n)) return true;
			else vals.add(n);
		}
		return false;
	}

	//return the indices of the two nums
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> vals = new HashMap<Integer, Integer>();
		int[] pair = new int[2];
		for(int i = 0; i<nums.length; i++) {
			if(vals.containsKey(target - nums[i])){
				pair[0] = vals.get(target-nums[i]);
				pair[1] = i;
				return pair;
			}
			else {vals.put(nums[i], i);}
		}
		return null;
	}
}
