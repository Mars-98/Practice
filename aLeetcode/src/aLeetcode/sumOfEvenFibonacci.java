package aLeetcode;

public class sumOfEvenFibonacci {
	public static void main(String[]args) {
		System.out.println(sumOfEvenFib(4000000));
		 System.out.println(nextPrime(7));
	}
	
	//have 3 pointers that keep track of each other, move all three each time, added keeps track of adding the tweo next to each other
	// and a and b keeo track of the two next to be added while b is the one that walks ahead to be compared
	public static int sumOfEvenFib(int limit) {
		int sum = 0;
		int a = 1;
		int b = 1;
		int added = 0;
		while(b <= limit) {
			if(b%2==0) {
				sum+=b;
			}
			added = a+b;
			a = b;
			b = added;
		}
		
		return sum;
	}
	
	
	//They increment num by 1 in the beginning because we're looking for the NEXT num
	//and we divide each num by i, and once we get an even num, that means it's not prime, so we have to incremeent 
	// then start from scratch again and check that num starting from 2
	 public static int nextPrime(int num){
		 num++;
	      for (int i = 2; i < num; i++) {
	         if(num%i == 0) {
	            num++;
	            i=2;
	         } 
	      }
	      return num;
	 }
}
