import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class LongestConsecutiveSubsequence {
	public static void main(String[]args) {
		int[] arr = {1, 5, 7, 3, 2, 4, 0};
		System.out.println(LCS(arr));
	}
	//Is not correct, too hard, will come back to it in the future
	public static int LCS(int[] arr) {
		Arrays.sort(arr);
		HashMap<Integer, Integer> max = new HashMap<Integer, Integer>();
		int counter = 0;
		int key = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] + 1 == arr[i+1]) {
				counter++;
			}else {
				max.put(key, counter);
				counter = 0;
			}
		}
		
		int maxOccurence = 0;
		for(Entry<Integer, Integer> entry: max.entrySet()) {
			if(entry.getValue() > maxOccurence) {
				maxOccurence = entry.getValue();
			}
		}
		return maxOccurence;
	}
}
