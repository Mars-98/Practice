
public class reverseInt {
	public static void main(String[]args) {
		int num = -87;
		System.out.println(reverse_int(num));
	}
	
	// turn into string, then conv reverse, then turn back to int and multiply by sign of n
	public static int reverse_int(int n) {
		String conv = Integer.toString(Math.abs(n));
		String reversed = "";
		for(int i = 0; i < conv.length(); i++) {
			reversed = conv.charAt(i) + reversed;
		}
		int max = (int)(Integer.parseInt(reversed) * Math.signum(n));
		if(max > Integer.MAX_VALUE) {
			return 0;
		}
		return max;
	}
	
	//	doing it mathematically
//	public static int reverse_int(int n) {
//		int reversed = 0;
//		while(Math.abs(n)>0){
//            int digit = n%10;
//            reversed = reversed*10 + digit;
//            n = n/10;
//        }
//		//check if it overflows
//		if(reversed > Integer.MAX_VALUE) {
//			return 0;
//		}
//		return reversed;
//	}
}
