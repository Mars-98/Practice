package aLeetcode;

import java.util.HashSet;

public class LongestSubstringWORep {
	public static void main(String[]args) {
		System.out.print(lengthOfLongestSubstring("abcabcac"));
	}
	/*
	 * Given a string, find the length of the longest substring without repeating characters.
	 * 
	 * 	Input: "abcabcbb"
	 *	Output: 3 
	 *	Explanation: The answer is "abc", with the length of 3.
	 *
	 *
	 *	Input: "bbbbb"
	 *	Output: 1
	 *	Explanation: The answer is "b", with the length of 1.
	 *
	 *
	 *	Input: "pwwkew"
	 *	Output: 3
	 *	Explanation: The answer is "wke", with the length of 3. 
	 *   Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 *
	 */
	public static int lengthOfLongestSubstring(String s) {
		int i = 0;
		int j = 0;
		int max = 0;
		HashSet<Character> uniqueVals = new HashSet<Character>();
		
		while(j<s.length()) {
			if(!uniqueVals.contains(s.charAt(j))) {
				uniqueVals.add(s.charAt(j));
				j++;
				max = Math.max(max, uniqueVals.size());
			}else {
				uniqueVals.remove(s.charAt(i));
				i++;
			}
		}
		return max;
	}
}
