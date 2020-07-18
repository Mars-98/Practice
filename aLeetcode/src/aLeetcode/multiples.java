package aLeetcode;

public class multiples {
	public static void main(String[]args) {
		System.out.print(sumOfMultiples(1000));
	}
	//Find the sum of multiples of 3 or multiples of 5
	public static int sumOfMultiples(int n) {
		int sum = 0;
		for(int i = 0; i <n; i++) {
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
