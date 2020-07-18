package aLeetcode;
import java.util.HashMap;
import java.util.Map.Entry;

public class kFreqNum {
	public static void main(String[]args) {
		int[] arr = {1, 6, 1, 3, 4, 6, 6};
		System.out.print(freqNum(arr, 3));
	}
	
	//Finding the element that occurs the n specified times inside of the array
	public static int freqNum(int[] arr, int n) {
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		
		for(int num: arr) {
			if(freq.containsKey(num)) {
				int value = freq.get(num);
				freq.replace(num, ++value);
			}else {
				freq.put(num, 1);
			}
		}
		for(Entry<Integer, Integer> num2: freq.entrySet()) {
			if(num2.getValue() == n) {
				return num2.getKey();
			}
		}
		return -1;
	}
}
