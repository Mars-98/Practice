import java.util.HashSet;
import java.util.Set;

public class happyNumber {
	public static void main(String[]args) {
		Set<Integer> visited = new HashSet<Integer>();
		System.out.println(isHappyNum(7, visited));
		System.out.println(isHappyN(570));
		System.out.println(isHappy(19));
	}
	
	//Used a hashset to check for duplicates
	public static boolean isHappyNum(int num, Set<Integer> visited) {
		//takes care of cycles, any number that is below 10 will cycle back to a previously seen answer
		/*EX: 
		 * +-> 4 -> 16 ->  37 -> 58---+
	    |                          |
	    |                          |
	    +- 20 <- 42 <- 145 <- 89 <-+ 
	    */
		//number starts somewhere and will keep adding the same digits of the same number in a cycle
//		if(num < 10) return num == 1 || num == 7;
//		instead of this, we could pass in a hashset and check is number has been visited before
			
		int digit = 0;
		int sum = 0;
        while(num > 0){
            digit = num % 10;
            sum += Math.pow(digit, 2);
            num = num / 10;
        }
        if (visited.contains(sum)) return false;
        if(sum == 1) return true;
        visited.add(sum);
		
        return isHappyNum(sum, visited);
	}
	
	//if we dont have this check, numbers less than 10, will go through a increase decrease cycle over same numbers.
    //But we must check for 7 separately as well
	//Did it without the checking of the visited values method
	public static boolean isHappyN(int num) {
		//takes care of cycles, any number that is below 10 will cycle back to a previously seen answer
		/*EX: 
		 * +-> 4 -> 16 ->  37 -> 58---+
	    |                          |
	    |                          |
	    +- 20 <- 42 <- 145 <- 89 <-+ 
	    */
		//number starts somewhere and will keep adding the same digits of the same number in a cycle
		if(num < 10) return num == 1 || num == 7; // I dont even understand this, so dont use it!
		//This method doesn't detect a cycle
		int digit = 0;
		int sum = 0;
        while(num > 0){
            digit = num % 10;
            sum += Math.pow(digit, 2);
            num = num / 10;
        }
        
        if(sum == 1) return true;
		
        return isHappyN(sum);
	}
	
	
	//NonRecurive solution
	public static boolean isHappy(int num) {
		
		HashSet<Integer> visited = new HashSet<Integer>();
		//because 1 is a happy number, so return true
		while(num != 1 && num > 0) {
			int sum = 0;
			int digit = 0;
			int cur = num;
			//when the number reaches 0, you cant really keep squaring it
			while(cur > 0) {
				digit = cur % 10;
				sum+=Math.pow(digit, 2);
				cur = cur / 10;
			}
			if(visited.contains(sum)) return false;
			visited.add(sum);
			num = sum;
		}
		return true;
		
	}
}
