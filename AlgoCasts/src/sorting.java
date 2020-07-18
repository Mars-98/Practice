
import java.util.Arrays;


public class sorting {
	public static void main(String[]args) {
		int[] test = {1,5, 6, 6, 7,3,76,2,7,9};
		int[] result = selectionSort(test);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

		int[] left = {1,6,9};
		int[] right = {5,8,9, 10, 20};

		int[] merged = merge(left, right);
		for(int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] + " ");
		}
		System.out.print("\n");
		
		
 		
	}
	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			//we do arr.length - i - 1 to handle the checking for the arr[j+1] case
			for(int j = 0; j<arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int lesser = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = lesser;
				}
			}
		}
		return arr;
	}

	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int indexOfMin = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[indexOfMin] > arr[j]) {
					indexOfMin = j;
				}
			}
			if(indexOfMin != i) {
				int lesser = arr[indexOfMin];
				arr[indexOfMin] = arr[i];
				arr[i] = lesser;
			}
		}

		return arr;
	}
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		
		int center = (int) Math.floor(arr.length/2);
		int[] left = Arrays.copyOfRange(arr, 0, center); //anything up to but not including center
		int[] right = Arrays.copyOfRange(arr, center, arr.length);
		
		return merge(mergeSort(left), mergeSort(right));
		
	}
	
	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				result[k] = left[i];
				i++;
				
			}else {
				result[k] = right[j];
				j++;
			}
			k++;
		}

		if(i < left.length) {
			//we have a temp for i and j in case there are left overs in either of the arrays
			//and we have to iterate over the those items, bc in the array, it doesn't delete them,
			//you have to move over the items and oretend they've been deleted. 
			//so we do the the length of the array minus the current index we're at, to get the remaining items in the array
			int iTmp = i;
			for(int m = 0; m < left.length - iTmp; m++) {
				result[k] = left[i];
				k++;
			}
		}else if(j < right.length) {
			//j 
			int jTmp = j;
			for(int n = 0; n < right.length - jTmp; n++) {
				result[k] = right[j];
				j++;
				k++;
			}
		}
		return result;
	}
}
