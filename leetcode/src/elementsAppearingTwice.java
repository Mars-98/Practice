import java.util.HashMap;
import java.util.Map.Entry;

public class elementsAppearingTwice {
	
	public static void main(String[]args) {
		int[] arr = {1,2,3,4,4,1,3};
		System.out.print(singleNumber(arr));
	}
	
	//Return the value that only appears once
	public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> sing = new HashMap<Integer, Integer>();
        for(int n: nums){
            if(sing.containsKey(n)){
                int val = sing.get(n);
                sing.replace(n, ++val);;
            }else{
                sing.put(n, 1);
            }
        }
        for(Entry<Integer, Integer> entry: sing.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
