package aLeetcode;
import java.util.HashMap;

public class romanToInteger {
	public static void main(String[]args) {
		System.out.print(romanToInt("CCXLVII"));
	}
/*
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
 * Instead, the number four is written as IV.
 *  Because the one is before the five we subtract it making four. 
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * 
 * 
 * We subtract from the result when the left number is less than the right number
 * Rules:
 * - I can be placed before V (5) and X (10) to make 4 and 9. 
 * - X can be placed before L (50) and C (100) to make 40 and 90. 
 * - C can be placed before D (500) and M (1000) to make 400 and 900.
 * */

	public static int romanToInt(String s) {
		
		HashMap<Character, Integer> romanNum = new HashMap<Character, Integer>();
		romanNum.put('I', 1);
		romanNum.put('V', 5);
		romanNum.put('X', 10);
		romanNum.put('L', 50);
		romanNum.put('C', 100);
		romanNum.put('D', 500);
		romanNum.put('M', 1000);
		
		int result = 0;
        for(int i = 0; i < s.length(); i++){
        	//We check for length-1 here bc we dont want to go out of bounds when we call i+1
            if(i < s.length()-1 && (romanNum.get(s.charAt(i)) < romanNum.get(s.charAt(i+1)))){
            	result-= romanNum.get(s.charAt(i));
            }else {
            	result+=romanNum.get(s.charAt(i));
            }
        }
        return result;
		
    }
}
