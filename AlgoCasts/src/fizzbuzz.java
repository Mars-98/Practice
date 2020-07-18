
public class fizzbuzz {
	public static void main(String[]args) {
		fizzBuzz(10);
	}
	public static void fizzBuzz(int n) {
		for(int i = 1; i<=n; i++) {
			if(i % 3==0 && i % 5 == 0){ // or i % 15 == 0
				System.out.println("fizzbuzz");
			}else if(i%3==0) {
				System.out.println("fizz");
			}else if(i%5==0) {
				System.out.println("buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
