import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraychunking {
	public static void main(String[]args) {
		int[] array = {2,2,2,7,9,6,4,3};
		//ArrayList<List<Integer>> arr1 = chunk1(array,3);
		List<int[]> arr = chunk(array,3);
		//List<ArrayList<Integer>> arr2 = chunk2(array,3);
		for(int i = 0; i < arr.size(); i++) {
			int[] r = arr.get(i);
			for(int j = 0; j < r.length; j++) {
				System.out.print(r[j]);
			}
			System.out.print("\n");
		}
		
	}
	//works!!!
	public static ArrayList<int[]> chunk(int[] unchunked, int size) {
		ArrayList<int[]> chunked = new ArrayList<int[]>();
		
		for (int start = 0; start < unchunked.length; start += size) {
	        int end = Math.min(start + size, unchunked.length);
	        int[] chunk = Arrays.copyOfRange(unchunked, start, end);
	        chunked.add(chunk);
	    }
		return chunked;
	}
	

	//Not the best solution, stay away
	public static ArrayList<List<Integer>> chunk1(int[] unchunked, int size) {
	ArrayList<List<Integer>> finalChunk = new ArrayList<List<Integer>>();
	ArrayList<Integer> chunked = new ArrayList<Integer>();
    for (int i = 0; i < unchunked.length; i++) {
    	chunked.add(unchunked[i]);
    }

    for (int start = 0; start < chunked.size(); start += size) {
        int end = Math.min(start + size, chunked.size());
        List<Integer> sublist = chunked.subList(start, end);
        finalChunk.add(sublist);
    }
    return finalChunk;
	}
	
////create empty chunked list of arrays
//	//for each elements in unchunked
//	//if last element in chunked  exists OR the size of the last element equal size
//	//add new ArrayList  into chunked
//	//if last element in chunked doesnt exist && the size of the last element is less than size
	//call the last ArrayList element inside of chunked, then add value from unchunked into it
	
	public static List<ArrayList<Integer>> chunk2(int[] unchunked, int size) {
		List<ArrayList<Integer>> chunked = new ArrayList<ArrayList<Integer>>(); 
		chunked.add(new ArrayList<Integer>());
		for(int i = 0; i<unchunked.length; i++) {
			if(chunked.get(chunked.size()-1)==null || chunked.get(chunked.size()-1).size() == size) {
				chunked.add(new ArrayList<Integer>());
			}
				ArrayList<Integer> chunk = chunked.get(chunked.size()-1);
				chunk.add(unchunked[i]);
		}
		
		return chunked;
	}
	
}