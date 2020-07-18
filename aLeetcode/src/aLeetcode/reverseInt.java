package aLeetcode;

public class reverseInt {
	public static void main(String[] args) {
		System.out.print(reverse(1534236469));
	}
	//reversing an int while minding overflow or underflow
	public static int reverse(int x) {
		long reverse = 0;
		while(x!=0) {
			int digit = x % 10;
			reverse = (reverse * 10) + digit;
			x/=10;
		}
		if(reverse >Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
			return 0;
		}
        return (int)reverse;
    }
}
