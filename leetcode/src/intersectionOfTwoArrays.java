import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfTwoArrays {
	public static void main(String[]args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] result = intersection(nums1, nums2);
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	//Given two arrays, write a function to compute their intersection.
	/*
	 *	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	 *	Output: [2]
	 *
	 *	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	 *	Output: [9,4]
	 *
	 * */
	 
	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> one = new HashSet<Integer>();

        for(int i: nums1){
            one.add(i);
        }
        int k = 0;
        for(int j :nums2){
           if(one.contains(j)){
        	   nums2[k] = j;
           		k++;
           		one.remove(j);            }
        }
        return Arrays.copyOfRange(nums2, 0, k);
    }
}
